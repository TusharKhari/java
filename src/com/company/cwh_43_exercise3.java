package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
          int i;
          int n;
          Scanner Sc = new Scanner(System.in);

    public Game(){
        Random ran = new Random();
        i = ran.nextInt(9);
    }
    public void userInput(){
        System.out.println("enter your guess");
        n = Sc.nextInt();
    }
    public void isCorrectAns(){
        if(i ==n){
            System.out.println("your guess is correct");
        }
        else{
            System.out.println("no. guessed by comp " + i);
            System.out.println("your guess is in correct re-enter your guess no. : ");
            userInput();
        }
    }

}

public class cwh_43_exercise3 {
    public static void main(String[] args) {

        Game g = new Game();
        g.userInput();
        g.isCorrectAns();



    }
    /*

    create a class, which allows a user to play"guess the no."
    game once. Game should have the following methods:
    1. constructor to generate the random variable number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by a user is true
    4. getter and setter for noOfGuesses
    use properties such as noOfGuesses(int), etc to get this task done.

     */

}
