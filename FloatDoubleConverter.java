import java.util.Scanner;

/**
 * FloatDoubleConverter
 */
public class FloatDoubleConverter {

  public static void main(String[] args) {

    // System.out.println("Welcome to converter :Enter your desired number");
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt(); 
    // boolean onGoing = true;

    // while (onGoing) {
    //    System.out.println("Enter your desired number:");
    //     double  kgram = num * 0.453592d;
    //     // 1pound = 0.453592k
        
    //     System.out.println("Converting:"+num+"pound "+" = "+kgram+"kg");
    //     String ans = sc.next("press y to resume n end");

    //     if (ans.equals("n")) {
    //       onGoing = false;
    //     }
   // }

    int num = 200;
    double  kgram = num * 0.453592d;   
    System.out.println("Converting:"+num+" pound "+" = "+kgram+"kg");
    
  }
}