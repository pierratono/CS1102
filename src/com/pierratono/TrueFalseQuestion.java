package com.pierratono;

import javax.swing.*;
import java.awt.*;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {
        super(question);
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel("     "+question+"     ", JLabel.CENTER));
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);
        initQuestionDialog();

        answer = answer.toUpperCase();
        if (answer.equals("TRUE")) correctAnswer ="TRUE";
        if (answer.equals("FALSE")) correctAnswer ="FALSE";

    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}

