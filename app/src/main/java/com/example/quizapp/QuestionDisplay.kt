package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuestionDisplay : AppCompatActivity(),View.OnClickListener {
    private var progressBar:ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var buttonSubmit:Button? = null
    private var hintimgd:ImageView?=null
    private var tv:TextView?=null
    private var timerd:TextView?=null
    private var index=0
    private var t:CountDownTimer?=null
    private var timerout=0
    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<QuestionList>? = null
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var mSelectedOptionPosition: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_display)

        //Get the NAME from intent and assign it the variable
        mUserName = intent.getStringExtra("USER_NAME1")
        index=intent.getIntExtra("Value",0)


        //connect to the view by its id
        progressBar=findViewById(R.id.progressbardisp)
        tvProgress = findViewById(R.id.countdisp)
        tvQuestion = findViewById(R.id.Questiondisp)
        ivImage = findViewById(R.id.imagedisp)
        tvOptionOne = findViewById(R.id.option1disp)
        tvOptionTwo = findViewById(R.id.option2disp)
        tvOptionThree = findViewById(R.id.option3disp)
        tvOptionFour = findViewById(R.id.option4disp)
        buttonSubmit = findViewById(R.id.btndisp)
        hintimgd=findViewById(R.id.hintimage)
        tv=findViewById(R.id.hinttext)
        timerd=findViewById(R.id.timerdisp)
        ChooseCardview()
        mQuestionsList=randomfn(mQuestionsList!!)
        setQuestion()



        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        buttonSubmit?.setOnClickListener (this)
        hintimgd?.setOnClickListener(this)




    }



    /**
     * A function for setting the question to UI components.
     */
    private fun setQuestion() {
        timer()
        val question: QuestionList =
            mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.
        defaultOptionsView()
        if (mCurrentPosition == mQuestionsList!!.size) {
            buttonSubmit?.text = "FINISH"
        } else {
            buttonSubmit?.text = "SUBMIT"
        }
        progressBar?.progress =
            mCurrentPosition // Setting the current progress in the progressbar using the position of question
        tvProgress?.text =
            "$mCurrentPosition" + "/" + progressBar?.max // Setting up the progress text

        // Now set the current question and the options in the UI
        tvQuestion?.text = question.questionasked
        ivImage?.setImageResource(question.image)
        tvOptionOne?.text = question.option1
        tvOptionTwo?.text = question.option2
        tvOptionThree?.text = question.option3
        tvOptionFour?.text = question.option4
    }

    /**
     * A function to set default options view when the new question is loaded or when the answer is reselected.
     */
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.options_bg
            )
        }
        tv?.text=""
    }

    override fun onClick(view: View?)
    {
        when (view?.id)
        {
            R.id.option1disp ->
            {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }

            }

            R.id.option2disp ->
            {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.option3disp ->
            {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.option4disp ->
            {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }
            R.id.btndisp->
            {
                t?.cancel()
                if (mSelectedOptionPosition == 0 ) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= 10-> {

                            setQuestion()
                        }
                        else -> {

                            val intent =
                                Intent(this, Result::class.java)
                            intent.putExtra("USER_NAME2", mUserName)
                            intent.putExtra("A",mCorrectAnswers)
                            mCurrentPosition=0
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    // This is to check if the answer is wrong
                    if (question!!.corretOption != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrongoptions_bg)
                    }else{
                        mCorrectAnswers++
                    }

                    // This is for correct answer
                    answerView(question.corretOption, R.drawable.correctoptions_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        buttonSubmit?.text = "FINISH"
                    } else {
                        buttonSubmit?.text = "GO TO NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }
            }
            R.id.hintimage->{
                hintimgd?.let {
                    val  q=mQuestionsList!![mCurrentPosition-1]
                    tv?.text=q.hint
                }
            }
        }
    }

    /**
     * A function to set the view of selected option view.
     */
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.clickingsetbg
        )
    }

    /**
     * A function for answer view which is used to highlight the answer is wrong or right.
     */
    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }

    fun randomfn(mql:ArrayList<QuestionList>):ArrayList<QuestionList>
    {
        for(i in 1..10)
        {
            var x=(Math.random() * (14  + 1)).toInt() + 0
            var y=(Math.random() * (14  + 1)).toInt() + 0
            var z=(Math.random() * (14  + 1)).toInt() + 0
            var zz=(Math.random() * (14 + 1)).toInt() + 0
            val temp=mql[x]

            mql[x]=mql[mql!!.size-y-1]
            mql[mql!!.size-y-1]=temp
            var temp1=mql[zz]

            mql[zz]=mql[mql!!.size-z-1]
            mql[mql!!.size-z-1]=temp1
        }
        return mql
    }
    fun ChooseCardview()
    {
        when(index)
        {
            1->
            {
                mQuestionsList = content.getQuestionBio()
            }
            2->
            {
                mQuestionsList = content.getQuestionBio()
            }
            3->{
                mQuestionsList = content.getQuestionPhysics()
            }
            4->{
                mQuestionsList = content.getQuestionPhysics()
            }
            5->{
                mQuestionsList = content.getQuestionPhysics()
            }
            6->{
                mQuestionsList = content.getQuestionPhysics()
            }
        }

    }
    fun timer()
    {
        timerout=0
        t=object : CountDownTimer(10000, 1000)
        {

            override fun onTick(millisUntilFinished: Long)
            {
                timerd?.setText("" + (millisUntilFinished / 1000+1))
            }

            override fun onFinish() {
                mCurrentPosition++
                if(mCurrentPosition>10)
                {
                    mCurrentPosition=0
                    val intent = Intent(this@QuestionDisplay, Result::class.java)
                    intent.putExtra("USER_NAME2", mUserName)
                    intent.putExtra("A",mCorrectAnswers)
                    startActivity(intent)
                    finish()
                }
                setQuestion()
            }
        }.start()
    }
}
