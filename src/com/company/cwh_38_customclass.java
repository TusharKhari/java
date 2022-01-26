package com.company;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is "+ name);
      //  System.out.println("my salary is "+ salary);
    }
    public   int getSalary(){
        return salary;
    }
    }


public class cwh_38_customclass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
         //instantiating a new employee object
        Employee1 khari = new Employee1();
        Employee1 john = new Employee1();

        // setting attributes for khari
        khari.id = 12;
        khari.name = "code with khari";
       // khari.salary = 99;
        // setting attributes for john
        john.id = 16;
        john.name = "john the don";
        john.salary = 14;
        int salary = john.getSalary();
        System.out.println(salary);

//        //printing attributes
//        System.out.println(khari.id);
//        System.out.println(khari.name);
        khari.printDetails();
        john.printDetails();
    }
}
