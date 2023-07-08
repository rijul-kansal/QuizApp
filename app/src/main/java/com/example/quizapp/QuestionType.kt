package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class QuestionType : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_type)
        var cd=findViewById<CardView>(R.id.cardView1)
        var user_name=intent.getStringExtra("USER_NAME")
        cd.setOnClickListener {
            var intent= Intent(this,QuestionDisplayBio::class.java)
            intent.putExtra("USER_NAME1",user_name)
            startActivity(intent)

        }

    }
}