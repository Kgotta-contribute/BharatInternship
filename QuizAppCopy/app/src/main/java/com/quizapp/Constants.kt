package com.quizapp

import com.quizapp.R
import com.quizapp.Question

//object Constants {
//
//    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
//    // START
//    const val USER_NAME: String = "user_name"
//    const val TOTAL_QUESTIONS: String = "total_questions"
//    const val CORRECT_ANSWERS: String = "correct_answers"
//    // END
//
//    fun getQuestions(): ArrayList<Question> {
//        val questionsList = ArrayList<Question>()
//
//        // 1
//        val que1 = Question(
//            1, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_argentina,
//            "Argentina", "Australia",
//            "Armenia", "Austria", 1
//        )
//
//        questionsList.add(que1)
//
//        // 2
//        val que2 = Question(
//            2, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_australia,
//            "Angola", "Austria",
//            "Australia", "Armenia", 3
//        )
//
//        questionsList.add(que2)
//
//        // 3
//        val que3 = Question(
//            3, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_brazil,
//            "Belarus", "Belize",
//            "Brunei", "Brazil", 4
//        )
//
//        questionsList.add(que3)
//
//        // 4
//        val que4 = Question(
//            4, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_belgium,
//            "Bahamas", "Belgium",
//            "Barbados", "Belize", 2
//        )
//
//        questionsList.add(que4)
//
//        // 5
//        val que5 = Question(
//            5, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_fiji,
//            "Gabon", "France",
//            "Fiji", "Finland", 3
//        )
//
//        questionsList.add(que5)
//
//        // 6
//        val que6 = Question(
//            6, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_germany,
//            "Germany", "Georgia",
//            "Greece", "none of these", 1
//        )
//
//        questionsList.add(que6)
//
//        // 7
//        val que7 = Question(
//            7, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_denmark,
//            "Dominica", "Egypt",
//            "Denmark", "Ethiopia", 3
//        )
//
//        questionsList.add(que7)
//
//        // 8
//        val que8 = Question(
//            8, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_india,
//            "Ireland", "Iran",
//            "Hungary", "India", 4
//        )
//
//        questionsList.add(que8)
//
//        // 9
//        val que9 = Question(
//            9, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_new_zealand,
//            "Australia", "New Zealand",
//            "Tuvalu", "United States of America", 2
//        )
//
//        questionsList.add(que9)
//
//        // 10
//        val que10 = Question(
//            10, "What country does this flag belong to?",
//            R.drawable.ic_flag_of_kuwait,
//            "Kuwait", "Jordan",
//            "Sudan", "Palestine", 1
//        )
//
//        questionsList.add(que10)
//
//        return questionsList
//    }
//}


object Constants{
        // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    fun getQuestions(): ArrayList<Question>
    {
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_aud,
            "Hong Kong Dollar",
            "Australian Dollar",
            "Dhriram",
            "Swedish Krona",
            2
        )
        questionsList.add(que1)

        val que2 = Question(2, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_brl,
            "Indian Rupee",
            "Australian Dollar",
            "Brazilian Real",
            "New Zealand Dollar",
            3
        )
        questionsList.add(que2)

        val que3 = Question(3, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_cad,
            "South Korean Won",
            "Australian Dollar",
            "Mexican Peso",
            "Canadian Dollar",
            4
        )
        questionsList.add(que3)

        val que4 = Question(4, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_euro,
            "Euro",
            "Singapore Dollar",
            "Dhriram",
            "Swedish Krona",
            1
        )
        questionsList.add(que4)

        val que5 = Question(5, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_gbp,
            "Hong Kong Dollar",
            "British Pound Sterling",
            "Saudi Riyal",
            "Norwegian Krone",
            2
        )
        questionsList.add(que5)

        val que6 = Question(6, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_hkd,
            "Hong Kong Dollar",
            "Mexican Peso",
            "outh African Rand",
            "Japanese Yen",
            1
        )
        questionsList.add(que6)

        val que7 = Question(7, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_inr,
            "Swedish Krona",
            "Australian Dollar",
            "Brazilian Real",
            "Indian Rupee",
            4
        )
        questionsList.add(que7)

        val que8 = Question(8, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_jpy,
            "Japanese Yen",
            "Chinese Yuan Renminbi",
            "Dhriram",
            "Brazilian Real",
            1
        )
        questionsList.add(que8)

        val que9 = Question(9, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_krw,
            "Hong Kong Dollar",
            "Australian Dollar",
            "South Korean Won",
            "Swedish Krona",
            3
        )
        questionsList.add(que9)

        val que10 = Question(10, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_mxn,
            "Swedish Krona",
            "South African Rand ",
            "Dhriram",
            "Mexican Peso",
            4
        )
        questionsList.add(que10)

        val que11 = Question(11, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_nok,
            "Hong Kong Dollar",
            "Norwegian Krone",
            "Swiss Franc ",
            "Japanese Yen ",
            2
        )
        questionsList.add(que11)

        val que12 = Question(12, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_nzd,
            "New Zealand Dollar",
            "Australian Dollar",
            "Dhriram",
            "Russian Ruble",
            1
        )
        questionsList.add(que12)

        val que13 = Question(13, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_rub,
            "Hong Kong Dollar",
            "Australian Dollar",
            "Russian Ruble",
            "Swedish Krona",
            3
        )
        questionsList.add(que13)

        val que14 = Question(14, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_sar,
            "Canadian Dollar",
            "Indian Rupee ",
            "Dhriram",
            "Saudi Riyal",
            4
        )
        questionsList.add(que14)

        val que15 = Question(15, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_sgd,
            "Singapore Dollar",
            "Australian Dollar",
            "Canadian Dollar ",
            "Swedish Krona",
            1
        )
        questionsList.add(que15)

        val que16 = Question(16, "Can you identify the nation that proudly displays this currency note?",
            R.drawable.ic_uae,
            "Hong Kong Dollar",
            "Australian Dollar",
            "Dhriram",
            "Swedish Krona",
            3
        )
        questionsList.add(que16)

        return questionsList

    }
}