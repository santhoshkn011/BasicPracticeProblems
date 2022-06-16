//1.6 Write a program to demonstrate static variables, methods, and blocks.

package com.bridgelabz;

public class StaticVarMetBlock {

    //declaring static variables
    static int date = 11;
    static int year;

    //declaring Static method "dob"
    static void dob(String month) {

        System.out.println("My date of birth is " + date + " " + month + " " + year +".");
    }

    //Static block
    static {
        System.out.println("Running Static block.");
        year = 2006 - date;
    }

    public static void main(String args[]) {
        dob("April"); //calling method "dob", passing argument "April".
    }
}
