package javaExercise1_50;

import java.util.Scanner;

public class _5 {
  public static void main(String[] args) {


//     Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125
    Scanner sc = new Scanner(System.in);
    System.out.println("Input first number:");
    int firstVal = sc.nextInt();
    System.out.println("Input second number:");
    int secondVal = sc.nextInt();

    char operator = sc.next().charAt(0);
   

    switch (operator) {
      case '+':
        
        break;

      case '-':
        
        break;
      case '*':
        
        break;
      case '/':
        
        break;  
    
      default:
      System.out.println("Unknown operator");
        break;
    }


    System.out.println(firstVal+" x "+secondVal +" = "+ (firstVal * secondVal));
    sc.close();
    
  }
}
