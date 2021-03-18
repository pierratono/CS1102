package com.pierratono;

import javax.swing.*;
import java.awt.*;

public abstract class Question {
    Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel("    "+question+"    ",JLabel.CENTER));
    }
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;
    String ask() {
        question.setVisible(true);
        return question.answer;
    }
    void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
        }
    }
    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
    static void showResults() {
        JOptionPane.showMessageDialog(null,nCorrect+"Correct out of "+nQuestions+" questions");
    }
}