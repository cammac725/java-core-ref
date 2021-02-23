package com.lambda;

public class Athlete extends Human {
    private String sport;

    public Athlete() {
        super();
        this.sport = "";
    }

    public Athlete(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    // from parent abstract class
    @Override
    public int ageInDogYears() {
        return super.getAge() * 7;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete: " + super.getName() + ", " + sport;
    }
}
