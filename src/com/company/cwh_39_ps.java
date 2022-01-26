package com.company;

import java.util.Scanner;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void  setName(String n){
        name=n;

    }
}
class Cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callFriend(){
        System.out.println("calling");
    }

}
class Square{
    int a;
//    int A;
//    int p;
    public int side(){
        return a;
    }
    public int area(){
       return a*a;
    }public int perimeter(){
        return 4*a;
    }

}
 class Rectangle{
    int a;
    int b;
    public void sides(){
        System.out.println("sides of rectangle : "+a+ " " + b);

    }
    public  int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}
public class cwh_39_ps {
    public static void main(String[] args) {
        //p1
        Employee khari = new Employee();
        khari.setName("code with khari");
        khari.salary = 50;
        System.out.println(khari.getName());
        System.out.println(khari.getSalary());
        //p2
        System.out.println("p2");
        Cellphone phone = new Cellphone();
        phone.callFriend();
        phone.ring();
        phone.vibrate();
//p3
        Square s = new Square();

        System.out.println("enter the side of square");
        Scanner b = new Scanner(System.in);
        s.a = b.nextInt();
       // s.a = c;

        System.out.println("side you entered : "+s.side());
       // System.out.println(s.perimeter());
        System.out.println("perimeter of square is : "+ s.perimeter());
       // System.out.println(s.area());
        System.out.println("are of square is : "+ s.area());

        // p4
        System.out.println("p4 rect");
        System.out.println("enter length and width of rectangle");
        Rectangle r= new Rectangle();
       // int d;
       // int e;
        Scanner d = new Scanner(System.in);
         r.a = d.nextInt();
        // Scanner e = new Scanner(System.in);
         r.b = d.nextInt();

      //  r.a = 2;
       // r.b =3;
        r.sides();
        System.out.println("area of rectangle : "+r.area());
        System.out.println("perimeter of rectangle : "+ r.perimeter());

    }
}
