package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Mainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var btn:Button=findViewById<Button>(R.id.btn)
        var ed:EditText=findViewById(R.id.edittext)
            btn.setOnClickListener {
                if(ed.text.isNotEmpty())
                {
                    var intent = Intent(this, QuestionType::class.java)
                    intent.putExtra("USER_NAME",ed.text.toString())
                    startActivity(intent)

                }
                else
                {
                    Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
                }
                finish()

            }

    }
}