package com.example.quizgame

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What is the name of this football player?",
            R.drawable.ic_messi2,
            "Lionel Messi",
            "Karim Benzema",
            "Bruno Fernandez",
            "Kun Aguero",
            1
        )

        questionsList.add(que1)

        val que2 = Question(2,"Which country is this player from?",
            R.drawable.ic_kane,
            "Spain",
            "United States of America",
            "Ireland",
            "England",
            4
        )

        questionsList.add(que2)

        val que3 = Question(3,"Which club does this player play for?",
            R.drawable.ic_casemiro,
            "Real Madrid",
            "Flamingo",
            "Athletic Madrid",
            "Manchester United",
            4
        )

        questionsList.add(que3)

        val que4 = Question(4,"What position in soccer does he play?",
            R.drawable.ic_courtois,
            "Striker",
            "Goalkeeper",
            "Defender",
            "Midfielder",
            2
        )

        questionsList.add(que4)

        val que5 = Question(5,"What premier league club does he play for?",
            R.drawable.ic_de_bruyne,
            "Manchester United",
            "Liverpool",
            "Manchester City",
            "Chelsea",
            3
        )

        questionsList.add(que5)

        val que6 = Question(6,"What club did he score the most goals in?",
            R.drawable.ic_lewandowski,
            "Barcelona",
            "Bayern Munich",
            "Borussia Dortmund",
            "Leipzig",
            2
        )

        questionsList.add(que6)

        val que7 = Question(7,"What year did he win the world cup?",
            R.drawable.ic_mbappe,
            "2018",
            "2010",
            "2014",
            "2022",
            1
        )

        questionsList.add(que7)

        val que8 = Question(8,"What country is he from?",
            R.drawable.ic_neymar,
            "Italy",
            "Argentina",
            "Brazil",
            "Spain",
            3
        )

        questionsList.add(que8)

        val que9 = Question(9,"What is this player's preferred foot?",
            R.drawable.ic_ronaldo,
            "Left",
            "Head",
            "Both",
            "Right",
            4
        )

        questionsList.add(que9)

        val que10 = Question(10,"Which country in Africa is this player from?",
            R.drawable.ic_salah,
            "Egypt",
            "Algeria",
            "Morocco",
            "Niger",
            1
        )

        questionsList.add(que10)
        return questionsList
    }
}