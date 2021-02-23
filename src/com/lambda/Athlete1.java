package com.lambda;

public class Athlete1 implements Person{
    private String sport;
    private String name;
    private int age;

    public Athlete1() {
        this.sport = "";
    }

    public Athlete1(String name, int age, String sport) {
        this.sport = sport;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete: " + getName() + ", " + sport;
    }
}
