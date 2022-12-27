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

    System.out.println("Select operation<(+),(-),(*),(/)>:");
    char operator = sc.next().charAt(0);
   
    String op;
    int ans;
    switch (operator) {
      
      case '+':
        op = "+";
        ans = (firstVal + secondVal);
        break;

      case '-':
        op = "-";
        ans = firstVal - secondVal;
        break;

      case '*':
        op = "*";
        ans = firstVal * secondVal;
        break;
        
      case '/':
        op = "/";
        ans = firstVal / secondVal;
        break;  

      default:
      op = "?";
      System.out.println("Unknown operator");
      ans = 0;
        break;
    }


    System.out.println(firstVal+" "+op+" "+secondVal +" = "+ ans);
    sc.close();
    
  }
}
