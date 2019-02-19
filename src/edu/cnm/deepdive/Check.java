package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = scanner.nextInt();
    Check.digitSum(a);
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);


  }


  public static int digitSum(int a) {

    String b;
    // creates local string variable

    int c = 0;
    //creates local int variable

    b = Integer.toString(a);
    // assigns parameter int using to string method to the local b string variable

    for (int i = 0; i < b.length(); i++) { // iterates over the local b string variable
      c += b.charAt(i) - 48; // assigns the numeric value of the individual chars to the local variable c
    }
    return c; // return


  }

}
