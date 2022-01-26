package com.company;

import java.util.Scanner;

class  Hotel1{
    private int roomNo ;
    private String custName;
    private String roomCat;
   // private int terrifCharges ;
    private int daysStayed;
   // int tb;
    Scanner Sc = new Scanner(System.in);

    public int CALC(){
        int tb = 0;
        if(roomCat.equals("CLUB")  ){
            tb = daysStayed*2000;
        }else if (roomCat.equals("SUIT")){
            tb = daysStayed*5000;
        }else if (roomCat.equals("EXECUTIVE")){
            tb = daysStayed*10000;
        }

        return tb;
    }


    public void takeDetails(){
        System.out.println("enter customer's name : ");
        custName = Sc.next();
        System.out.println("enter room no.:");
        roomNo = Sc.nextInt();
        System.out.println("enter category of room : ");
        roomCat = Sc.next();
        System.out.println(roomCat);
        System.out.println("enter no. of days stayed : ");
        daysStayed = Sc.nextInt();
        //CALC();

    }

    public void printDetails(){
        System.out.println("customer's name : " + custName);
        System.out.println("your room no. is : " + roomNo);
        System.out.println("your room category is : " + roomCat);
        System.out.println("room allocated for "+ daysStayed + " days");
        System.out.println("your total bill is : " + CALC());

    }
}

public class HarQues1 {

    public static void main(String[] args) {

       Hotel1 hotel1 = new Hotel1();


               hotel1.takeDetails();
               hotel1.printDetails();
            //   hotel1.CALC();


    }
}

