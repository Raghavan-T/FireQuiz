package com.quiz.raghavan.firequiz;
/**
 * Created by raghavan on 17/3/18.
 */

public class Questions4 {

    public String mQuestions[] = {
            "Which four options describe the correct default values for array elements of the types indicated?\n" +
                    "\n" +
                    "    int -> 0\n" +
                    "    String -> \"null\"\n" +
                    "    Dog -> null\n" +
                    "    char -> '\\u0000'\n" +
                    "    float -> 0.0f\n" +
                    "    boolean -> true\n",
            "Which three are valid declarations of a float?\n" +
                    "\n" +
                    "    float f1 = -343;\n" +
                    "    float f2 = 3.14;\n" +
                    "    float f3 = 0x12345;\n" +
                    "    float f4 = 42e7;\n" +
                    "    float f5 = 2001.0D;\n" +
                    "    float f6 = 2.81F;\n",
            "Which is true about a method-local inner class?",
            "Which constructs an anonymous inner class instance?",
            "public class Test { }\n" +
                    "\n" +
                    "What is the prototype of the default constructor?",
            "Which is true about a method-local inner class?",
            "What is the value of \"d\" after this line of code has been executed?\n" +
                    "\n" +
                    "double d = Math.round ( 2.5 + Math.random() );",
            "Which of the following would compile without error?",
            " \t\n" +
                    "\n" +
                    "Which of the following are valid calls to Math.max?\n" +
                    "\n" +
                    "    Math.max(1,4)\n" +
                    "    Math.max(2.3, 5)\n" +
                    "    Math.max(1, 3, 5, 7)\n" +
                    "    Math.max(-1.5, -2.8f)\n",
            "What is the name of the method used to start a thread execution?"
    };

    private String mChoices[][] = {
            {"1, 2, 3, 4", "1, 3, 4, 5", "2, 4, 5, 6", "3, 4, 5, 6"},
            {"1, 2, 4", "2, 3, 5", "1, 3, 6", "2, 4, 6"},
            {"It must be marked final.", "It can be marked abstract.", "It can be marked public.", "It can be marked static."},
            {"Runnable r = new Runnable() { };", "Runnable r = new Runnable(public void run() { });", "Runnable r = new Runnable { public void run(){}};", "System.out.println(new Runnable() {public void run() { }});"},
            {"Test( )", "Test(void)", "public Test( )", "public Test(void)"},
            {"It must be marked final.", "It can be marked abstract.", "It can be marked public.", "It can be marked static."},
            {"2", "3", "4", "2.5"},
            {"int a = Math.abs(-5);", "int b = Math.abs(5.0);", "int c = Math.abs(5.5F);", "int d = Math.abs(5L);"},
            {"1, 2 and 4", "2, 3 and 4", "1, 2 and 3", "3 and 4"},
            {"init();","start();","run();","resume();"}
    };

    private String mCorrectAnswers[] = {
            "1, 3, 4, 5",
            "1, 3, 6",
            "It can be marked abstract.",
            "System.out.println(new Runnable() {public void run() { }});",
            "public Test( )",
            "It can be marked abstract.",
            "3",
            "int a = Math.abs(-5);",
            "1, 2 and 4",
            "start();"
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
