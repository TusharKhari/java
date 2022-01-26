package com.company;

public class cwh_31_methods {

      int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c ;
//        if (a>b){
//            c = a+b;
//        }else{
//            c = (a+b)*5;
//        }
        cwh_31_methods obj = new cwh_31_methods();
        c = obj.logic(a,b);
        int a1 = 15;
        int b1 = 8;
        int c1 ;
//        if (a1 > b1){
//            c1 = a1+b1;e
//        }else{
//            c1 = (a1+b1)*5;
//        }
        cwh_31_methods obj1 = new cwh_31_methods();
       c1= obj1.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
