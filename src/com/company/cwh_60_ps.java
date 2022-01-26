package com.company;
  abstract class Pen{
   abstract void write();
     abstract void refill();
  }

  class FountainPen extends Pen{
     // @Override
      void write() {
          System.out.println("write");
      }

   //   @Override
      void refill() {
          System.out.println("refill");
      }
      void changeNib(){
          System.out.println("changing nib");
      }
  }

     class Monkey{
      void jump(){
          System.out.println("jumping...");
      }
      void bite(){
          System.out.println("biting...");
      }
     }
interface BasicAnimal{
    void eat();
    void sleep();
}

     class Human extends Monkey implements BasicAnimal {
      void speak(){
          System.out.println("hello sir!...");
      }

         public void eat() {
             System.out.println("human is eating");
         }

         public void sleep() {
             System.out.println("human is sleeping");
         }
     }

public class cwh_60_ps {
    public static void main(String[] args) {
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        Human human = new Human();
        human.eat();
        human.bite();
        Monkey monkey = new Monkey();
        monkey.bite();

        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
    }
}
