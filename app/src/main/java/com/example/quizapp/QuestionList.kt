package com.example.quizapp

data class QuestionList(
    var questionasked:String,
    var image:Int,
    var option1:String,
    var option2:String,
    var option3:String,
    var option4:String,
    var corretOption:Int,
    var hint:String
)
