package com.company;

      class NegativeRadiusException extends Exception{
       //   @Override
          public String toString(){
              return "radius can not be negative!";
          }
      }
public class cwh_84_throw_throws
{
      public static float area(int r) throws NegativeRadiusException {
          if (r<0){
              throw new RuntimeException();
          }
          float result = (float) (Math.PI*r*r);
          return result;
    }
 public static int divide(int a, int b) throws ArithmeticException {
        // made by khari
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // shivam - uses divide function created by khari
        //int c = 0;
        try {
        int  c = divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("abe low ");
        }
        try {
            float ar = area(-6);
            System.out.println(ar);

        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("your entered radius is negative");
        }
    }
}
