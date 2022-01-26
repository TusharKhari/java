package com.company;

import java.util.Scanner;

public class cwh_86_ps14 {
    public static void main(String[] args) {
        //p1
       // p3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (flag && i<5){
         try   {
             System.out.println("enter index");
                index = Sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
                break;
            }
         catch (Exception e){
             System.out.println("invalid index");
             i++;
         }
        }
    }
}
