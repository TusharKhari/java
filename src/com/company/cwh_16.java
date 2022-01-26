package com.company;

import java.util.Scanner;

public class cwh_16 {
    public static void main(String[] args) {
       // int age;

        Scanner age = new  Scanner(System.in);
        System.out.println("enter your age : ");
        int a = age.nextInt();

        if(a >18 || a == 18){
            System.out.println("you can drive");
        } else {
            System.out.println("you can't drive");
        }
    }
}
//    Scanner sc = new Scanner(System.in);
//    String name = sc.nextLine();