package com.lambda;

public class Tester {
    public static void main(String[] args) {

        Human h = new Human(); // declares and instantiates
                                // "new" - operator that triggers the constructor
                                // "h" is a reference variable, knows the location in mem
        Human h1 = new Human("Tyler", 35);
        h1.setName("Chuck");

        System.out.println(h1.getName());
        System.out.println(h1);

        Athlete a1 = new Athlete("Spike", 34, "Bowling");
        System.out.println(a1);

        Human h2 = new Athlete("Ben", 23, "Archery");
        // only has access to Human & Object classes
        // cast as Athlete to get those classes
        ((Athlete) h2).getSport();
        System.out.println(h2.toString());
    }
}
