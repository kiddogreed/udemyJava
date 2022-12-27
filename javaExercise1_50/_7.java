package javaExercise1_50;

import java.util.Scanner;

public class _7 {
  public static void main(String[] args) {
//     7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

Scanner sc = new Scanner(System.in);

  System.out.println("enter number for multiplication table: ");
  int n = sc.nextInt();
 // System.out.println(n);

  for (int i = 1; i <= n; i++) {
    System.out.println(n+" x "+i+" = "+n*i);

  
  }

  }
}
