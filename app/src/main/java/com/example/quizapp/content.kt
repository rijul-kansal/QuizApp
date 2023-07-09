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

    fun getQuestionPhysics():ArrayList<QuestionList>
    {
        var arrlis=ArrayList<QuestionList>()

        arrlis.add(QuestionList(
            "Which of the following materials will be attracted to a magnet?",
            R.drawable.phyq1,
            "Plastic","Mud",
        "Iron","Cotton", 3,
            "This material used to make bridges,houses"
        ))
        arrlis.add(QuestionList(
            "Gravity is the force which pulls things down to Earth. What is true about the force of gravity on the moon compared to Earth?",
            R.drawable.phyq2,
            "It is weaker.","It is stronger.",
            "There is no gravity on the Moon at all."," It is the same.",
            1,
            "She is still weak after her illness. co-relate with options"
        ))
        arrlis.add(QuestionList(
            "Breaking the barrier of the speed of ____ causes the phenomenon known as the sonic boom.",
            R.drawable.phyq3,
            "Lion","Light",
            "Lepard","Sound", 4,
            "Co-Relate with the image"
        ))
        arrlis.add(QuestionList(
            "Which body in our Solar System was once classified as a planet, but isn't any more?",
            R.drawable.phyq4,
            "Uranus","Mars",
            "Jupiter","Venus", 1,
            "This planet is fartest from the sun"
        ))
        arrlis.add(QuestionList(
            "What was the name of the man who shouted 'Eureka' when he got into the bath?",
            R.drawable.phyq5,
            " Isaac Newton"," Leonardo da Vinci",
            "Archimedes","Harry Potter", 3,
            "Who Gave the Theory of Buoyancy"
        ))
        arrlis.add(QuestionList(
            "Which of the following substances acts as an insulator to (stops) the path of electricity?",
            R.drawable.phyq6,
            "Plastic","Plastic",
            "Iron","Rubber", 4,
            "This Substance used to make Tyres"
        ))
        arrlis.add(QuestionList(
            "\n" +
                    "When light bends as it enters a different medium the process is known as what?",
            R.drawable.phyq7,
            "Refraction","Reflection",
            "Transmission","Non Of these", 1,
            "See Image"
        ))
        arrlis.add(QuestionList(
                    "A magnifying glass is what type of lens?",
            R.drawable.phyq8,
            "Concave","Convex",
            "Transparent","Non of these", 2,
            "this type of mirror ued as Rear view mirror"
        ))
        arrlis.add(QuestionList(
                    "Electric resistance is typically measured in what units?",
            R.drawable.phyq9,
            "R","Ohm",
            "Sec","C/g", 2,
            "Unit Used bt this formula also R/V"
        ))
        arrlis.add(QuestionList(
            "\n" +
                    "What is the first name of the famous scientist who gave us Newton’s three laws of motion?",
            R.drawable.phyq10,
            "Issac","Archimedes",
            "Harry Potter","Charles darwin", 1,
            "See image"
        ))
        arrlis.add(QuestionList(
                    "Electric power is typically measured in what units?",
            R.drawable.phyq11,
            "OHMS","R",
            "SEC","Watts", 4,
            "Sount similar to whats"
        ))
        arrlis.add(QuestionList(
            "Theoretical physicist James Maxwell was born in what country?",
            R.drawable.phyq12,
            "Scotland","Finland",
            "America","India", 31,
            "Suffix is Land"
        ))
        arrlis.add(QuestionList(
                    "The most recognized model of how the universe begun is known as the?",
            R.drawable.phyq13,
            "Big Bang","Inflationary Big Bang",
            "The flat Earth","the geocentric model", 1,
            "See Image"
        ))
        arrlis.add(QuestionList(
                    "Who is the Hubble Space Telescope named after?",
            R.drawable.phyq14,
            "Edwin Hubble","John Hubble",
            "Issac Newton ","Harry Potter", 1,
            "Suffic is Hubble"
        ))
        arrlis.add(QuestionList(
                    "Earth is located in which galaxy?",
            R.drawable.phyq15,
            "Milky Way","Whirlpool Galaxy",
                    "Sunflower Galaxy",
                    "Black Eye Galaxy", 1,
            "Name of Galaxy is related to one of the dairy product"
        ))
        return arrlis

    }
}