package com.company;
      interface Bicycle{
          void applyBrake(int decrement);
          void speedUp(int increment);
      }

      class AvonCycle implements Bicycle {
          void blowHorn(){
              System.out.println("pee pee poo poo");
          }
       public void applyBrake(int decrement){
              System.out.println("applying brake");
          }
        public void speedUp(int increment){
              System.out.println("applying speedUp");
          }
      }
public class cwh_54_interfaces {
    public static void main(String[] args) {

    }
}
