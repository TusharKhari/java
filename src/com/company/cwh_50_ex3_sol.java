package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1{
      public int number;
      public int inputNumber;
      public int noOfGuesses=0;

//      public int getNoOfGuesses() {
//          return noOfGuesses;
//      }
//
//      public void setNoOfGuesses(int noOfGuesses) {
//          this.noOfGuesses = noOfGuesses;
//      }

       Game1(){
          Random rand = new Random();
          this.number = rand.nextInt(10);
      }
      void takeUserInput(){
          System.out.println("guess the no. : ");
          Scanner sc = new Scanner(System.in);
          inputNumber = sc.nextInt();
      }
      boolean isCorrectNo(){
          noOfGuesses++;
          if (inputNumber == number){
              System.out.println("no. of gases: " + noOfGuesses);
              return true;
          }
          else if (inputNumber<number){
              System.out.println("too low..");
          }
          else if(inputNumber>number){
              System.out.println("too high...");
          }
          return false;
      }
  }


public class cwh_50_ex3_sol {
    public static void main(String[] args) {

        Game1 g1= new Game1();
        boolean b= false;
        while (!b) {
            g1.takeUserInput();
            b = g1.isCorrectNo();
            System.out.println(b);
        }
    }
}
