package javaExercise1_50;
//beauty contest
//create basic game of alice in borderland
//4 player generating 4 random numbers between 0-100
//user input number 0 - 100
//average multiply by 0.8
//the closest to the number the winner
//all player have 10 hp points and player lose if life == 0.
//only 1 player win per round


//breakdown
//create message method that define all string output
//create input for players
//generate 4 player which generate random number
//create object model for all ai bot enemy
//create game loop that will continue the game until 1 remains


import java.util.Random;
import java.util.Scanner;
public class _kingDiamond {

    public static void welcomeMsg(){
        System.out.println("welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your answer:");
        int f_input = sc.nextInt();
        System.out.println(f_input);

        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        System.out.println("Random number between 1 and 100: " + showMe);
    }
    public static void main(String[] args) {

        welcomeMsg();
    }
}
