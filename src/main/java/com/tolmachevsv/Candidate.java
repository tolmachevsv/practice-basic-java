package com.tolmachevsv;

public class Candidate extends Person {
    private final String[][] listOfAnswers = {
            {"Cleaner", "QA Automation"},
            {"Java", "Pascal"},
            {"5", "6"},
            {"Information technology", "Pronoun in english"},
            {"10 minutes a week maximum", "2 hours a day"}
    };
    private int candidateScore;

    public Candidate(String name, int age, boolean isItEducation) {
        super(name, age, isItEducation);
    }

    void tellAboutExperience() {
        System.out.println("Кандидат рассказывает о своем богатом опыте на Java.");
        if (isItEducation()) {
            System.out.println("Он учился на Айтишника, это здорово!");
            candidateScore++;
        } else {
            System.out.println("К сожалению, не имеет IT-образования :(");
        }
    }

    void answerQuestions(int index) {
        // это похоже на костыль (поправь, если нет), если поставить 0, то ответы у кандидатов одинаковые всегда
        double min = -1.0;
        double max = 1.0;
        String[] answerCurrentQuestion = listOfAnswers[index];
        double answerNum = (Math.random() * (max - min) + 1) + min;
        String answer = answerCurrentQuestion[(int) answerNum];
        System.out.println("Ответ кандидата: " + answer);

        if (answer.equals("QA Automation") ||
                answer.equals("Java") ||
                answer.equals("6") ||
                answer.equals("Information technology") ||
                answer.equals("2 hours a day")) {
            countScore();
        }
    }

    void countScore() {
        candidateScore++;
    }

    void totalCandidateScore() {
        if (candidateScore >= 0 && candidateScore <= 3) {
            System.out.println("Ваши баллы: " + candidateScore + " из 6, к сожалению, Вы нам не подходите:(");
        } else {
            System.out.println("Ваши баллы: " + candidateScore + " из 6, Вы успешно прошли собеседование! :)");
        }
    }
}
