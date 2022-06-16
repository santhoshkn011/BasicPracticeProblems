//1.2 Write a Java program to display the default value of all primitive data types of Java

package com.bridgelabz;

public class DefaultPrimitiveDataType {
    //declaring static variables
    static boolean var1;
    static byte var2;
    static short var3;
    static int var4;
    static long var5;
    static float var6;
    static double var7;
    static String var8;

    public static void main(String args[]) {

        System.out.println("The default values of these data types are: ");
        System.out.println("boolean: " + var1);
        System.out.println("byte: " + var2);
        System.out.println("short: " + var3);
        System.out.println("int: " + var4);
        System.out.println("long: " + var5);
        System.out.println("float: " + var6);
        System.out.println("double: " + var7);
        System.out.println("String: " + var8);
    }
}
