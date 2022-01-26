package com.company;

import java.util.Scanner;


class Cylinder0{
    private int radius;
    private int height;

//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }

    //  float pi = 3.14f;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double SA(){
       return 2*3.14*radius*(radius+height);
    }
    public double A(){
        return 3.14*radius*radius*height;
    }
}

public class cwh_44_ps9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter height");
        int a = sc.nextInt();
        Cylinder0 myCy = new Cylinder0();
        myCy.setHeight(a);
      int h=  myCy.getHeight();
        System.out.println(h);
        myCy.setRadius(9);
        int r = myCy.getRadius();
        System.out.println(r);
        System.out.println("sa: "+myCy.SA());
        System.out.println("a: " + myCy.A());

//p3
//        Cylinder myCy = new Cylinder(9, 5);
//
//        System.out.println(myCy.SA());


    }
}
