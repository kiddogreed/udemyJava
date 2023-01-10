package javaExercise1_50;
//beauty contest
//create basic game of alice in borderland
//4 player generating 4 random numbers between 0-100
//user input number 0 - 100
//average multiply by 0.8
//the closest to the number the winner
//all player have 10 hp points and player lose if life == 0.
//only 1 player win per round


//TODO breakdown
// 1 create message method that define all string output
// 2 create input for players
// 3 generate 4 player which generate random number
// 4 create object model for all ai bot enemy
// 5 create game loop that will continue the game until 1 remains


import java.util.Random;
import java.util.Scanner;
public class _kingDiamond {

    //all message store here
    public static void welcomeMsg(){
        System.out.println("welcome to King OF Diamond");


    }

    public static int  userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your answer:");
        int f_input = sc.nextInt();
        System.out.println(f_input);
        return f_input;
    }

    public static void generateNum(int answer ){
        Random randomNum = new Random();
        int p1 = randomNum.nextInt(100);
        int p2 = randomNum.nextInt(100);
        int p3 = randomNum.nextInt(100);
        int p4 = randomNum.nextInt(100);

        System.out.println("User  answer:" + answer);
        System.out.println("Player 2 answers :"+p1);
        System.out.println("Player 3 answers :"+p2);
        System.out.println("Player 4 answers :"+p3);
        System.out.println("Player 5 answers :"+p4);
        int ave = (p1+p2+p3+p4+answer)/5;
        System.out.println("Average: "+ave +"::x 0.8 = "+ ave * 0.8);

    }

    public class Players{
        String name;

    }
    public static void main(String[] args) {
        //Players john = new Players().name;
        boolean isGameOver = false;
        int healthPoints = 10;
        welcomeMsg();


        while (!isGameOver){

                //userInput();
                generateNum(userInput());
                healthPoints -= 1;

                if (healthPoints == 0){
                    isGameOver = true;
                    System.out.println(healthPoints);
                    System.out.println("gameover: you are dead:"+isGameOver);
                }


        }

    }
}
