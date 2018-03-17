package com.quiz.raghavan.firequiz;
/**
 * Created by raghavan on 17/3/18.
 */

public class Questions {

    public String mQuestions[] = {
            "In which numbering system can the binary number 1011011111000101 be easily converted to?",
            "The keyword used to transfer control from a function back to the calling function is",
            "How many bytes are occupied by near, far and huge pointers (DOS)?",
            "What would be the equivalent pointer expression for referring the array element a[i][j][k][l]",
            "What does the following declaration mean? \t\n" +
                    "int (*ptr)[10];",
            "In a file contains the line \"I am a boy\\r\\n\" then on reading this line into the array str using fgets(). What will str contain?",
            "Input/output function prototypes and macros are defined in which header file?",
            "What is stderr ?",
            "Which bitwise operator is suitable for turning off a particular bit in a number?",
            "If the two strings are identical, then strcmp() function returns"
    };

    private String mChoices[][] = {
            {"Decimal system", "Hexadecimal system", "Octal system", "No need to convert"},
            {"switch", "goto", "go back", "return"},
            {"near=2 far=4 huge=4", "near=4 far=8 huge=8", "near=2 far=4 huge=8", "near=4 far=4 huge=8"},
            {"((((a+i)+j)+k)+l)", "*(*(*(*(a+i)+j)+k)+l)", "(((a+i)+j)+k+l)", "((a+i)+j+k+l)"},
            {"ptr is array of pointers to 10 integers", "ptr is a pointer to an array of 10 integers", "ptr is an array of 10 integers", "ptr is an pointer to array"},
            {"\"I am a boy\\r\\n\\0\"", "\"I am a boy\\r\\0\"", "\"I am a boy\\n\\0\"", "\"I am a boy\""},
            {"conio.h", "stdlib.h", "stdio.h", "dos.h"},
            {"standard error", "standard error types", "standard error streams", "standard error definitions"},
            {"&& operator", "& operator", "|| operator", "! operator"},
            {"-1","1","0","Yes"}
    };

    private String mCorrectAnswers[] = {
            "Hexadecimal system","return","near=2 far=4 huge=4","*(*(*(*(a+i)+j)+k)+l)","ptr is a pointer to an array of 10 integers","\"I am a boy\\n\\0\"","stdio.h","standard error streams","& operator","0"
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
