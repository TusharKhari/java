package com.company;
    class Circle{
        Circle(int r){
            System.out.println("i am circle parameterized constructor ");
            this.radius = r;
        }
        public int radius;
        float a;
        public float area(){
            return a= (float) (Math.PI*this.radius*this.radius);
        }
    }

    class Cylinder extends Circle{
        Cylinder(int r, int h){
            super(r);
            this.height = h;

        }
        public int height;
        public float Volume(){
            return (float) (Math.PI*this.radius*this.radius)*height;
        }
    }

public class cwh_52_ps_ch10 {
    public static void main(String[] args) {
        //====p1
        Circle c = new Circle(12);
        System.out.println(c.area());
        Cylinder cy = new Cylinder(12 , 4);
        System.out.println(cy.Volume());

    }
}

