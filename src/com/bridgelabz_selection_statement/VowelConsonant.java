//1. Write a Program to Check Vowel or Consonant

package com.bridgelabz_selection_statement;
import java.util.Scanner; //importing scanner method

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");

        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default :
                System.out.println(ch + " is consonant");
        }
    }
}
