package com.company;

    class Phone{
        public void greet(){
            System.out.println("good morning");
        }
        public void name(){
            System.out.println("my name is java");
        }
    }


    class Smartphone extends Phone{
        public void swagat(){
            System.out.println("aapka swagat hai");
        }
        public void name(){
            System.out.println("my name is java 1");
        }
    }


public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        Smartphone smartphone = new Smartphone();
        Phone obj = new Smartphone();// yes it is allowed
        obj.name();
        obj.greet();


    }
}
