package com.company;



public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning "+ a +"bro");
    }
//    static void change(int a){
//        a = 98;
//       // System.out.println(a);
//    }
//    static  void change2(int [] arr){
//        arr[0]= 98;
//    }
//    static void tellJoke(){
//        System.out.println("I invented a new world. \n Plagiarism!");
//    }
    public static void main(String[] args) {

       // tellJoke();
//        int [] marks = {52, 73, 89,94};
//        // case1= the integer
//        int x = 45;
//        change(x);
//        System.out.println("the value after change is : " + x);
//
//        //case 2 = changing the array
//        change2(marks);
//        System.out.println("the value of x after running change is:"+ marks[0]);

        foo(3);


    }
}
