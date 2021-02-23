package com.lambda;

public class Athlete1 implements Person{
    private String sport;
    private String name;
    private int age;
    private static int count = 0;
    // must reference Athlete to access this, not Object
    public final static int var = 500;
    // final means it can't be changed after instantiation

    public Athlete1() {
        this.sport = "";
        count++;
    }

    // Javadocs
    /**
     * Describe constructor here
     * @param name This is the name of the athlete
     * @param age
     * @param sport
     */
    public Athlete1(String name, int age, String sport) {
        this.sport = sport;
    }

    public static int getCount() {
        return count;
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

    /**
     *
     * @return This returns the sport of the Athlete
     */
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete: " + name + ", " + sport;
    }
}
