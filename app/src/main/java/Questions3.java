package com.quiz.raghavan.firequiz;
/**
 * Created by raghavan on 17/3/18.
 */

public class Questions3 {

    public String mQuestions[] = {
            "Which of the following type of class allows only one object of it to be created?",
            "Which of the following is not a type of constructor?",
            "Which of the following is not the member of class?",
            "Which of the following concepts means determining at runtime what method to invoke?",
            "Which of the following term is used for a function defined inside a class?",
            "How many instances of an abstract class can be created?",
            "Which of the following cannot be friend?",
            "Which of the following concepts of OOPS means exposing only necessary information to client?",
            "cout is a/an __________ .",
            "How many types of polymorphisms are supported by C++?"
    };

    private String mChoices[][] = {
            {"Virtual class", "Abstract class", "Singleton class", "Friend class"},
            {"Copy constructor", "Friend constructor", "Default constructor", "Parameterized constructor"},
            {"Static function", "Friend function", "Const function", "Virtual function"},
            {"Data hiding", "Dynamic Typing", "Dynamic binding", "Dynamic loading"},
            {"Member Variable", "Member function", "Class function", "Classic function"},
            {"1", "5", "13", "0"},
            {"Function", "Class", "Object", "Operator function"},
            {"Encapsulation", "Abstraction", "Data hiding", "Data binding"},
            {"operator", "function", "object", "macro"},
            {"1","2","3","4"}
    };

    private String mCorrectAnswers[] = {
            "Singleton class","Friend constructor","Friend function","Dynamic binding","Member function","0","Object","Data hiding","object","2"
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
