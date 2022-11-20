package com.tolmachevsv;

public class Main {

    public static void main(String[] args) {
        Interviewer interviewer = new Interviewer("Vasiliy", 30, true);
        Candidate candidate1 = new Candidate("Sergey", 26, false);
        Candidate candidate2 = new Candidate("Vanek", 31, true);

        Person.sayHello(candidate1, interviewer);
        candidate1.tellAboutExperience();
        interviewer.askQuestions(candidate1);
        Person.sayGoodbye(candidate1, interviewer);

        System.out.println("-----------------------------------------"); // просто строка для отделения кандидатов
        Person.sayHello(candidate2, interviewer);
        candidate2.tellAboutExperience();
        interviewer.askQuestions(candidate2);
        Person.sayGoodbye(candidate2, interviewer);
    }
}
