package com.quiz.raghavan.firequiz;
/**
 * Created by raghavan on 17/3/18.
 */

public class Questions2 {

    public String mQuestions[] = {
            "What is an activity in Android?",
            "On which thread broadcast receivers will work in android?",
            "What is sleep mode in android?",
            "How to fix crash using log cat in android?",
            "What are the JSON elements in android?",
            "What is transient data in android?",
            "Can a class be immutable in android?",
            "How to get current location in android?",
            "Which of the following is/are are the subclasses in Android?",
            "What was the first phone released that ran the Android OS?"
    };

    private String mChoices[][] = {
            {"Activity performs the actions on the screen", "Manage the Application content", "Screen UI", "None of the above"},
            {"Worker Thread", "Main Thread", "Activity Thread", "None of the Above"},
            {"Only Radio interface layer and alarm are in active mode", "Switched off ", "Air plane mode ", "None of the Above"},
            {"G-mail", "log cat contains the exception name along with the line number", "Google search", "None of the above"},
            {"integer", "boolean", "null", "Number, string, boolean, null, array, and object"},
            {"Permanent data", "Secure data", "Temporary data", "Logical data"},
            {"No, it can't", "Yes, Class can be immutable", "Can't make the class as final class", "None of the above"},
            {"Using with GPRS", "Using location provider", "A & B", "Network servers"},
            {"Action Bar Activity", "Launcher Activity", "Preference Activity", "All of above"},
            {"Google gPhone", "T-Mobile G1", "Motorola Droid", "HTC Hero"}
    };

    private String mCorrectAnswers[] = {
            "Activity performs the actions on the screen",
            "Main Thread",
            "Only Radio interface layer and alarm are in active mode",
            "log cat contains the exception name along with the line number",
            "Number, string, boolean, null, array, and object",
            "Logical data",
            "Yes, Class can be immutable",
            "A & B",
            "All of above",
            "T-Mobile G1"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
