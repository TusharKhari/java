package com.company;

     abstract    class Parent2{
            public Parent2(){
                System.out.println("i am constructor of base 2");
            }
            public void sayHello(){
                System.out.println("hello");
            }
            abstract public void greet();
        }

        class Child2 extends Parent2{
         @Override
         public void greet(){
             System.out.println("gm");
         }
        }
     abstract    class  Child3 extends Parent2{
         public void th(){
             System.out.println("i am good");
         }
        }
public class cwh_53_abstract {
    public static void main(String[] args) {

        Child2 c = new Child2();

    }
}
