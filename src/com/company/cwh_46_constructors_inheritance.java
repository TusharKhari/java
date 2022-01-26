package com.company;

     class Base1{
         Base1(){
             System.out.println("me ek constructor hoon");
         }  Base1(int x){
             System.out.println("me ek overloaded constructor hoon with value of x as: "+ x);
         }
         public  int x;

         public void setX(int x){
             this.x = x;
         }
         public int getX(){
             return x;
         }
     }
     class Derived1 extends Base1{

         Derived1(){
          //   super(0);
             System.out.println("i am a derived class constructor");
         }
         Derived1(int x, int y){
             super(x);
             System.out.println("i am a derived class overloaded constructor with value of y as : "+ y);
         }
         int y;

         public void setY(int y){
             this.y = y;
         }
         public int getX(){
             return  y;
         }
     }
     class ChildofDerived extends  Derived1{
         ChildofDerived(){
             System.out.println("i am a child of derived constructor");
         }
         ChildofDerived(int x, int y, int z){
             super(x,y);
             System.out.println("i am a derived class overloaded constructor with value of z as : "+ z);
         }
     }
public class cwh_46_constructors_inheritance {
    public static void main(String[] args) {
       // Base1 b = new Base1();
      //  Derived1 d = new Derived1(14, 9);
        ChildofDerived cd = new ChildofDerived(12,13,15);
    }
     }
