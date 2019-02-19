package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    Check.digitSum(a);
    System.out.println(a);
    System.out.println(a / 9);
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);


  }


  public static int digitSum(int a) {
    String b;
    int c = 0;
    b = Integer.toString(a);
    for (int i = 0; i < b.length(); i++) {
      c += Integer.parseInt(b);
    }
    return c;


  }

}
