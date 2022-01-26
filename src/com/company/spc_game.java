package com.company;

import java.util.Random;
import java.util.Scanner;

public class spc_game {
    public static void main(String[] args) {
        System.out.println("player 1 choose and enter the no. \n 0. stone \n 1. paper\n 2. scissor  \nenter your choice " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random ran = new Random();
        int b = ran.nextInt(3);

        System.out.println("no. choosen by computer : "+b);

       if(a==0&&b==2||a==1&&b==2||a==2&&b==1||a==1&&b==0) {
           System.out.println("you are winner");
       }else if(a==b){
           System.out.println("draw");
       } else   if(a>2){
           System.out.println("andha h kya");
       }else {
           System.out.println("computer is winner");
       }
    }
}
