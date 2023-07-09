package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        var user_name=findViewById<TextView>(R.id.Name)
        var corrop=findViewById<TextView>(R.id.finalScore)
        var finish_btn=findViewById<Button>(R.id.finish_btn)
        val a=intent.getStringExtra("USER_NAME2")
        val b=intent.getIntExtra("A",0)

        user_name.text=a
        corrop.text="Your Score is $b out of 10."

        finish_btn.setOnClickListener {
            var intent= Intent(this,Mainactivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}