//1.5 To get the name using the command line.

package com.bridgelabz;
import java.util.Scanner;  //Importing the Scanner method for the user input

public class UserInput {
    public static void main(String args[]) {
        String s1;  // Declaring Variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        s1 = sc.nextLine();
        System.out.println("You have entered " +"'"+s1+"'.");
    }
}
