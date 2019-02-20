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
/**
  public static int reducedDigitSum(int input) {

    String stringVariable;

    int varHolder = 0;

    stringVariable = Integer.toString(input);

    for (int i = 0; i < stringVariable.length(); i++) {
      varHolder += stringVariable.charAt(i) - 48;
    }

    stringVariable = Integer.toString(varHolder);
    int[] varHolderArray = new int[stringVariable.length()];
    for (int i = 0; i < stringVariable.length() - 1; i++) {
      varHolderArray[i] = stringVariable.charAt(i) - 48;
    }

    if (varHolder > 9) {
      for (int i = 0; i < varHolderArray.length - 2; i++) {
        varHolderArray[0] += varHolderArray[i];
      }

    }



  }
 */



}
