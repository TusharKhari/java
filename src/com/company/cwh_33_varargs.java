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
       // System.out.println();
    }
}
