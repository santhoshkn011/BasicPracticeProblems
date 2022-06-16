//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

/* The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
   So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400.
   For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.
 */

package com.bridgelabz_basics;
import java.util.*; //importing utility method for the user input.

public class LeapYear {
    public static void main(String args[]) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();

        if(year >= 1582) {
            if(((year%4 ==0) && (year%100 != 0)) || (year%400 == 0)) {
                System.out.println("This is a leap year.");
            }
            else {
                System.out.println("This is not a leap year.");
            }
        }
        else {
            System.out.println("Please enter greater than or equal to 1582.");
        }
    }
}
