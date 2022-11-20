package com.tolmachevsv;

public class Person {

    private final String name;
    private final int age;
    private final boolean isItEducation;

    public Person(String name, int age, boolean isItEducation) {
        this.name = name;
        this.age = age;
        this.isItEducation = isItEducation;
    }

    static void sayHello(Candidate candidate, Interviewer interviewer) {
        System.out.println("Кандидат " + candidate.getName() + " здоровается с интервьером " + interviewer.getName());
    }

    static void sayGoodbye(Candidate candidate, Interviewer interviewer) {
        System.out.println("Кандадат " + candidate.getName() + " прощается с интервьером " + interviewer.getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isItEducation() {
        return isItEducation;
    }
}
