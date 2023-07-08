package com.example.quizapp

object content {
    var USER_NAME:String?=null
    var CORRECT_OPTION1:Int=0
    fun getQuestionBio() :ArrayList<QuestionList>
    {
        var arrlis=ArrayList<QuestionList>()

        arrlis.add(QuestionList(
                    "Which famous scientist introduced the idea of natural selection?",
                    R.drawable.bioq1,
            "Charles darwin","Louis Pasteur",
                    "Carl Woese","Gregor Mendel",
            1,
            "Was born in Shrewsbury,"
        ))
        arrlis.add(QuestionList(
                            "Botany is the study of?",
                    R.drawable.bioq2,
            "Plants","Animals",
                    "Humans","Insects",
            1,
            "Which give us Food"
        ))
        arrlis.add(QuestionList(
                    "Animals which eat both plants and other animals are known as what?",
            R.drawable.bioq3,
            "carnivores","herbivores",
                    "Omnivores","Non of these",
            3,
            "One of the Example is the King of the Jungle"
        ))
        arrlis.add(QuestionList(
                            "A group of dog offspring is known as a?",
            R.drawable.bioq4,
            "herd","Litter",
                    "troop, congress","colony",
            2,
            "Sound similar to Glitter"
        ))
        arrlis.add(QuestionList(
                            "The area of biology devoted to the study of fungi is known as?",
            R.drawable.bioq5,
            "Microbiology","Botany",
                    "zoology",
                    "Mycology",
            4,
            "Starts with letter M"
        ))
        arrlis.add(QuestionList(
            "Plants receive their nutrients mainly from?",
            R.drawable.bioq6,
            "Soil","Sun",
            "Water",
            "Qxygen",
            1,
            "We can walk on this"
        ))
        arrlis.add(QuestionList(
            "Mumps is a disease caused by __",
            R.drawable.bioq7,
            "Plants","Animals",
            "Virus",
            "Fungi",
            3,
            "another Example is Covid"
        ))
        arrlis.add(QuestionList(
            "N2 content is kept constant in the biosphere due to __",
            R.drawable.bioq8,
            "Hydrogen Cycle","NitrogenCycle",
            "Water Cycle",
            "Qxygen Cyle",
            2,
            "Which cycle consume and reproduce resp elements"
        ))
        arrlis.add(QuestionList(
            "Which organ is not used during digestion?",
            R.drawable.bioq9,
            "Pancrease","Stomach",
            "Kidney",
            "Lungs",
            4,
            "From where we Breadth"
        ))
        arrlis.add(QuestionList(
            "Is a horse herbivore, carnivore or omnivore?",
            R.drawable.bioq10,
            "Herbivore","Carnivore",
            "Omnivore",
            "Non of these",
            1,
            "No Hint"
        ))
        arrlis.add(QuestionList(
            "Which of these organs can grow back again if some of it is removed?",
            R.drawable.bioq11,
            "Lungs","Brain",
            "Liver",
            "Eyes",
            3,
            "Which release essential oil for body"
        ))
        arrlis.add(QuestionList(
            "DNA is shaped like a curved ladder. What is this shape called?",
            R.drawable.bioq12,
            "Double Helix","Single Helix",
            "Triple Helix",
            "Qurd Helix",
            1,
            "Interpret from image "
        ))
        arrlis.add(QuestionList(
            "Which  organ has villi.",
            R.drawable.bioq13,
            "Kidney","Large intestine",
            "small intestine",
            "Lungs",
            3,
            "Interpret from image"
        ))
        arrlis.add(QuestionList(
            "Dolphins are classified in the same order as ",
            R.drawable.bioq14,
            "Fish","JellyFish",
            "Shark",
            "Whales",
            4,
            "Loop similar to which animal "
        ))
        arrlis.add(QuestionList(
            "How many bones are there in the adult human body?",
            R.drawable.bioq15,
            "206","210",
            "205",
            "207",
            1,
            "Divisible by 2"
        ))
       return arrlis
    }
}