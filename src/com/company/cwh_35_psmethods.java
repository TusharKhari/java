package com.company;

import java.util.Scanner;

public class cwh_35_psmethods {
//    static  void multiplication(int n){
//        for(int i=1;i<=10; i++){
//            System.out.format("%d X %d = %d\n", n,i,n*i);
//        }
//    }
//
//    static void pattern1(int n){
//        for(int i=0; i<n; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print("*");
//
//            }
//            System.out.println("");
//        }
//    }
//    static int sum(int n){
//        if(n==1){
//            return 1;
//           //System.out.println("1");
//        }else{
//           return n+sum(n-1);
//           // int sum;
//           // sum = n+sum(n-1);
//           // System.out.println(n+sum(n-1));
//        }
//      //  System.out.println(sum(5));
//    }
//    static void pattern2(int n){
//        for (int i = n-1; i >=0; i--){
//            for (int j = 0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
   // static int fib(int n){
//        if (n==1){
//            return 0;
//
//        }else if (n==2){
//            return 1;
//        }
//        if(n==1||n==2){
//            return n-1;
//        }
//        else{
//            return fib(n-1) + fib(n-2);]
//        }
//    }
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);

            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        // p1
//
//        Scanner a = new Scanner(System.in);
//        int d = a.nextInt();
//        for (int b=1;b<11; b++){
//            int c;
//            c=d*b;
//            System.out.println(c);
//        }f
//      //  ==============================
       // multiplication(8);

        // =====p2==========
//        pattern1(5);
 // ==================================
        //p3
       // System.out.println(sum(5));
       //=============================
        // p4
        //  pattern2(4);


//        System.out.println(fib(7));
            pattern1_rec(3);

            //p8


    }
}
/*
    Scanner age = new  Scanner(System.in);
        System.out.println("enter your age : ");
                int a = age.nextInt();
 package com.company;

    public class cwh_33_varargs {
        static int sum(int ...arr){
            int result = 0;
            for(int a: arr ){
                //    result += a+result;
                // result =+ a+result;
//            result =+ a+result;
                result +=a;


            }
            return result;
        }
        public static void main(String[] args) {

            System.out.println("sum is " + sum(1,4));
            System.out.println("var args " + sum(1, 5,7));
            System.out.println("var args " + sum(1, 5,7, 8));
        }
    }
*/

