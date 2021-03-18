package com.pierratono;

public class Quiz {
    public static void main(String[] args) {
        Question question = new TrueFalseQuestion("Quizzes are fun!","true");
        question.check();
        question = new TrueFalseQuestion("Quizzes are more fun than programming!","false");
        question.check();
        question = new TrueFalseQuestion("Which one starts with T?","true");
        question.check();
        question = new TrueFalseQuestion("Which one starts with F?","false");
        question.check();
        question = new TrueFalseQuestion("Which one is not true?","false");
        question.check();
        question = new MultipleChoiceQuestion(
                "What is a quiz?",
                "A test of knowledge, especially a brief informal test given to students",
                "42",
                "A duck",
                "To get to the other side",
                "To be or not to be, that is the question.",
                "a");
        question.check();
        question = new MultipleChoiceQuestion("When is a quiz?",
                "Long, long ago",
                "Right now",
                "The best of times",
                "The worst of times",
                "Nevermore",
                "b");
        question.check();
        question = new MultipleChoiceQuestion("Where is a quiz?",
                "A galaxy far, far away",
                "Under the sea",
                "Right here",
                "There and back again",
                "The other side of the mountain",
                "c");
        question.check();
        question = new MultipleChoiceQuestion("Why is a quiz?",
                "I think, therefore it is.",
                "Who is to say?",
                "You tell me.",
                "Because learning is fun!",
                "Because I said so.",
                "d");
        question.check();
        question = new MultipleChoiceQuestion("How is a quiz?",
                "Fair to middling",
                "Not bad",
                "By a stroke of luck",
                "By accident",
                "Using Java object-oriented programming!",
                "e");

        question.check();
        MultipleChoiceQuestion.showResults();
    }
}
