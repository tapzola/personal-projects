package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Albania",
            1
        )

        questionsList.add(que1)

        val que2 = Question(2,"What country does this flag belong to?",
            R.drawable.ic_zimbabwe,
            "Zambia",
            "Kenya",
            "Botswana",
            "Zimbabwe",
            4
        )

        questionsList.add(que2)

        val que3 = Question(3,"What country does this flag belong to?",
            R.drawable.ic_spain,
            "Portugal",
            "Venezuela",
            "Belgium",
            "Spain",
            4
        )

        questionsList.add(que3)

        val que4 = Question(4,"What country does this flag belong to?",
            R.drawable.ic_united_states,
            "United Kingdom",
            "United States of America",
            "United Arab Emirates",
            "Liberia",
            2
        )

        questionsList.add(que4)

        val que5 = Question(5,"What country does this flag belong to?",
            R.drawable.ic_canada,
            "Cayman Islands",
            "Kiribati",
            "Canada",
            "Cameroon",
            3
        )

        questionsList.add(que5)

        val que6 = Question(6,"What country does this flag belong to?",
            R.drawable.ic_bangladesh,
            "Bahrain",
            "Bangladesh",
            "Botswana",
            "Bahamas",
            2
        )

        questionsList.add(que6)

        val que7 = Question(7,"What country does this flag belong to?",
            R.drawable.ic_botswana,
            "Botswana",
            "Malawi",
            "Tanzania",
            "Uganda",
            1
        )

        questionsList.add(que7)

        val que8 = Question(8,"What country does this flag belong to?",
            R.drawable.ic_ireland,
            "Italy",
            "Ivory Coast",
            "Ireland",
            "Senegal",
            3
        )

        questionsList.add(que8)

        val que9 = Question(9,"What country does this flag belong to?",
            R.drawable.ic_kenya,
            "Kuwait",
            "Russia",
            "Netherlands",
            "Kenya",
            4
        )

        questionsList.add(que9)

        val que10 = Question(10,"What country does this flag belong to?",
            R.drawable.ic_uruguay,
            "Uruguay",
            "Argentina",
            "Brazil",
            "Colombia",
            1
        )

        questionsList.add(que10)
        return questionsList
    }
}