package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//   System.out.println("taking input from user");
//   Scanner sc = new Scanner(System.in);
//   System.out.println("enter number 1");
//   int a =sc.nextInt();
//        System.out.println("enter number 2");
//        int b =sc.nextInt();
//        int sum = a + b;
//        System.out.println("the sum of these numbers is");
//        System.out.println(sum);

       System.out.println("this is percentage calculator !");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter marks of physics :");
       int a = sc.nextInt();
       System.out.println("enter marks of chemistry :");
       int b = sc.nextInt();
       System.out.println("enter marks of maths :");
       int c = sc.nextInt();
       System.out.println("enter marks of english :");
       int d = sc.nextInt();
       System.out.println("enter marks of optional subject :");
       int e = sc.nextInt();

       float perc =( ((a+b+c+d+e)/500)*100);
      //  float perc = (a+b+c+d+e)/5;

       System.out.println("your percentage is : ");
       System.out.println(perc);







    }
}
