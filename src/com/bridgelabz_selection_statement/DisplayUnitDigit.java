//2. Read a Number 1,10,100,1000 and display unit, ten hundred

package com.bridgelabz_selection_statement;
import java.util.Scanner;

public class DisplayUnitDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        if( num == 1) {
            System.out.println("Unit: One");
        }
        else if(num == 10) {
            System.out.println("Unit: Ten");
        }
        else if(num == 100) {
            System.out.println("Unit: Hundred");
        }
        else if(num == 1000) {
            System.out.println("Unit: Thousand");
        }
        else if(num == 10000) {
            System.out.println("Unit: Ten Thousand");
        }
        else {
            System.out.println("Enter Valid Unit(1, 10, 100, 1000 and 10000).");
        }

    }
}
