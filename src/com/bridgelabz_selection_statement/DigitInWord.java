//1. Read a single Digit Number and write in word

package com.bridgelabz_selection_statement;
import  java.util.*; //importing utility method

public class DigitInWord {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("You Entered Zero.");
        } else if (num == 1) {
            System.out.println("You Entered One.");
        } else if (num == 2) {
            System.out.println("You Entered Two.");
        } else if (num == 3) {
            System.out.println("You Entered Three.");
        } else if (num == 4) {
            System.out.println("You Entered Four.");
        } else if (num == 5) {
            System.out.println("You Entered Five.");
        } else if (num == 6) {
            System.out.println("You Entered Six.");
        } else if (num == 7) {
            System.out.println("You Entered Seven.");
        } else if (num == 8) {
            System.out.println("You Entered Eight.");
        } else if (num == 9) {
            System.out.println("You Entered Nine.");
        } else {
            System.out.println("Enter Valid Number(0 to 9).");
        }
    }
}
