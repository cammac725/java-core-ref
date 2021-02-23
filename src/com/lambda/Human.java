package com.lambda;

public abstract class Human {
    private String name;
    private int age;

    public Human() {
        name = "";
        age = 0;
//        System.out.println("Constructor here");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { // accessor
        return name;
    }

    public int getAge() {
        return age;
    }

    // abstract method must be overridden in subclass
    public abstract int ageInDogYears();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method signature:
    // the name of the method and the number & type of parameters

    // toString is called whenever a reference variable is printed
    @Override
    public String toString() {
        return "Human: " + name + ", age: " + age;
    }

    // Override is done when the method is also located in the parent class
}
