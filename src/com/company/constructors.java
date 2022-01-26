package com.company;

class MyMainEmployee{
    private   int id;
    private String name;

//    public MyMainEmployee(){
//        id = 45;
//        name = "your-name-here";
//    }
//    public MyMainEmployee(String myName){
//        id = 45;
//        name = myName;
//    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee khari = new MyMainEmployee("code with khari", 4);
    //    khari.setName("code with khari");
       // khari.setId(34);
        System.out.println(khari.getId());
        System.out.println(khari.getName());

    }
}
