package com.tolmachevsv;

public class Interviewer extends Person {
    String[] listOfQuestions = {
            "What position are you applying for?",
            "What PL do you need to know for this vacancy?",
            "Calculate the area of a rectangle with sides 2x3",
            "What does IT mean?",
            "How many hours a day do you spend studying Java?"
    };

    public Interviewer(String name, int age, boolean isItEducation) {
        super(name, age, isItEducation);
    }

    void askQuestions(Candidate candidate) {
        for (int i = 0; i < listOfQuestions.length; i++) {
            System.out.println("Interviewer asks the question №" + (i+1) + ": " + listOfQuestions[i]);
            candidate.answerQuestions(i);
        }
        candidate.totalCandidateScore();
    }
}
