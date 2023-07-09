package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class QuestionType : AppCompatActivity() , View.OnClickListener{
    private var cd1:CardView?=null
    private var cd2:CardView?=null
    private var cd3:CardView?=null
    private var cd4:CardView?=null
    private var cd5:CardView?=null
    private var cd6:CardView?=null

    var user_name:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_type)

        cd1=findViewById(R.id.cardView1)
        cd2=findViewById(R.id.cardView2)
        cd3=findViewById(R.id.cardView3)
        cd4=findViewById(R.id.cardView4)
        cd5=findViewById(R.id.cardView5)
        cd6=findViewById(R.id.cardView6)

        user_name=intent.getStringExtra("USER_NAME")
        cd1?.setOnClickListener(this)
        cd2?.setOnClickListener(this)
        cd3?.setOnClickListener(this)
        cd4?.setOnClickListener(this)
        cd5?.setOnClickListener(this)
        cd6?.setOnClickListener(this)

    }

    override fun onClick(v: View?)
    {
        when(v?.id)
        {
            R.id.cardView1-> {
                cd1?.let{
                    intentfn(1)
                }
            }
            R.id.cardView2-> {
                cd2?.let{
                    intentfn(2)
                }
            }
            R.id.cardView3-> {
                cd3?.let{
                    intentfn(3)
                }
            }
            R.id.cardView4-> {
                cd4?.let{
                    intentfn(4)
                }
            }
            R.id.cardView5-> {
                cd5?.let{
                    intentfn(5)
                }
            }
            R.id.cardView6-> {
                cd6?.let{
                    intentfn(6)
                }
            }
        }

    }
    fun intentfn(value :Int)
    {
        var intent = Intent(this, QuestionDisplay::class.java)
        intent.putExtra("USER_NAME1", user_name)
        intent.putExtra("Value", value)
        startActivity(intent)
    }
}