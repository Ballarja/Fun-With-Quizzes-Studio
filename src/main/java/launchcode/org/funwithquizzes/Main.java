package main.java.launchcode.org.funwithquizzes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        MultipleChoice quest1 = new MultipleChoice("a, b, c, d", "c");
        MultipleChoice quest2 = new MultipleChoice("Choose a, b, c, d", "a");
        TrueFalse trueFalse1 = new TrueFalse("Is it raining today", "false");
        TrueFalse trueFalse2 = new TrueFalse("Is it warm outside", "false");
    }
//    ArrayList<Question> initialQuizQuestions = new ArrayList<>();
//        initialQuizQuestions.add(quest1);
//        initialQuizQuestions.add(trueFalse1);
//        initialQuizQuestions.add(quest2);
//
//    Quiz practiceTest = new Quiz(initialQuizQuestions, new ArrayList<>());
//        practiceTest.addQuestionToQuiz(quest2);
//        practiceTest.addQuestionToQuiz(senators);
//        practiceTest.addQuestionToQuiz(kids);
//
//
//        practiceTest.printAndTakeQuiz();
//        practiceTest.checkUserResponsesAgainstAnswerKeyAndReturnGrade();

}
