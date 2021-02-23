package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // primitive types
            // int  boolean  double  short  long
//        int a;
//        double b;
//        boolean c;
//
//        a = 4;
//        b = 5.5;
//        c = false;

        // reference types

        // assignment operator - =
        // extended operators - +=  -=  *=  /=

//        int a = 1;
//        a += 2; // a = a + 2

        // increment and decrement operators
        // a++  a--

        // escape character
//        System.out.println("  \"  ");  // prints "
//        System.out.println("  \\  ");  // prints \
//        System.out.println("  asdf\nhjkl   "); // prints strings on separate lines

        // relational operators: < > <= >= == !=
        // always return true or false
//        System.out.println(4 < 5);
//        System.out.println(4 != 5);
//        System.out.println(4 == 5);

        // logical operators, in order of precedence
        // ! (not), && (and), || (or)
//        boolean a = true, b = false;
//        System.out.println(!a); // prints false
//        System.out.println(a && b); // prints false
//        System.out.println(a || b); // prints true
//        System.out.println(a || b && a); // like a || (b && a); prints true

        // short circuit: if first var is false in an && comparison,
        // it won't even check the second var
        // in an || comparison, it has to check the second no matter what the first is
//        System.out.println(b && a);
//        System.out.println(b || a);

        // casting
//        int a = (int) 5.5;
//        System.out.println(a); // casting does not round, so prints 5
//        double b = 5 / 6;
//        System.out.println(b); // prints 0, doing integer division
//        double c = (double) 5 / 6;
//        System.out.println(c); // prints 0.8333333333...

        // Strings: objects, but behave a little like primitives (no instantiation required)
//        String s = "Hello";
//        String s1 = "bye";
//        // concatenation
//        String end = s + " " + s1;
//        System.out.println(end);
//        end += " farewell"; // using extended operators
//        System.out.println(end);

        // Arrays, single dimensional arrays
//        int[] arr = new int[10]; // declare and instantiate a new array
//        int arr2[] = new int[10]; // can put brackets either place
//        arr[0] = 5; // set element at index 0
//        System.out.println(arr[0]); // element at index 0
//        System.out.println(arr.length); // total number of elements in array
//
//        int[] arr3 = {1, 2, 3, 4, 5}; // declares, instantiates, and initializes

        // two dimensional arrays
//        int[][] arry = new int[4][3]; // 2D array with 4 rows and 3 columns
//        System.out.println("Rows: " + arry.length); // prints number of rows
//        System.out.println("Cols: " + arry[0].length); // prints number of columns (elements in row 0)
//        int[][] arry2 = {{1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}}; // initializer list
//        System.out.println(arry2[1][1]);

        // ArrayList - can change
//        List<String> l = new ArrayList<>();
//        l.add("S1");
//        l.add("S2");
//        // l.remove(0);
//        System.out.println(l.size());
//        System.out.println(l.get(0));
//        System.out.println(l);
//        l.add(0, "S3");
//        System.out.println(l);
//        l.set(1, "new Val");
//        System.out.println(l);
//        //l.add(3); // won't compile, not a String
//
//        List<Integer> list = new ArrayList<>();
//        // Integer i = 5;
//        list.add(5);
//        System.out.println(list);
//
//        List<Double> dlist = new ArrayList<>();
//        dlist.add(5.5);
//        System.out.println(dlist);
//
//        List<Object> olist = new ArrayList<>();
//        olist.add("S1");
//        olist.add(5.5);
//        olist.add(34);
//        System.out.println(olist);

        // class Math
//        System.out.println(Math.max(4, 5));
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.abs(-5));
//        System.out.println(Math.PI);

        // control statements
//        boolean a = true, b = false;
//        if (b) {
//            System.out.println("Reached here");
//        } else if (!b) {
//            System.out.println(2);
//        } else {
//            System.out.println("Reached else");
//        }

        // repetition statements
        // while statement
//        int x = 4;
//        while (x < 10) {
//            System.out.println(x);
//            x++;
//        }

        // for statement
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        for ( ; ; ) {
//            System.out.println("Hello"); // infinite loop but works
//        }

        // forEach loop
        // List
//        List<String> list = new ArrayList<>();
//        list.add("Deer");
//        list.add("Duck");
//        list.add("Buck");
//        for(String s : list) {
//            System.out.println(s);
//        }

        // Array
//        int[] arr = {1, 3, 4, 5};
//        for(Integer i : arr) {
//            System.out.println(i);
//        }
//        for (int i = 0;i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int[] rows : arr) {
//            for(int i : rows) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // Abstract class - cannot be instantiated
        // abstract methods in this class must be used in subclass

        // Interface can't be instantiated, only has method signatures.

        // Overloading - method with same name, different number of parameters

        /**
         * Javadoc comments
         *  need to know @params and @return
         */

        // create array of any primitive or reference type
//        Athlete1[] arr = new Athlete1[10];
//
//        arr[0] = new Athlete1();
//        arr[1].getName(); // null pointer exception
//        arr[11] = new Athlete1(); // out of bounds exception

        // arithmetic exception
//        System.out.println(5/0);

        // equals method
        String s = "a";
        String s1 = "c";
        System.out.println(s.equals(s1));
        // are they exactly the same string?
        // no, false
        // Note: == refers to the same location in memory

        System.out.println(s.compareTo(s1));
        // returns 0, pos or neg integer
        // how do we get from s1 to s, this will return -2
        // "c" is 2 past "a" in the alphabet
        // based off ASCII table


        // should know insertion, selection and merge sort
    }
}
