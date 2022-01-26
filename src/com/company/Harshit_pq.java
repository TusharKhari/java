//package com.company;
//
//import java.util.Scanner;
//
//class  Hotel{
//    private int roomNo ;
//    private String custName;
//    private String roomCat;
//    private int terrifCharges ;
//    private int daysStayed;
//    int tb;
//
//    public int getRoomNo() {
//        return roomNo;
//    }
//
//    public void setRoomNo(int roomNo) {
//        this.roomNo = roomNo;
//    }
//
//    public String getCustName() {
//        return custName;
//    }
//
//    public void setCustName(String custName) {
//        this.custName = custName;
//    }
//
//    public String getRoomCat() {
//        return roomCat;
//    }
//
//    public void setRoomCat(int roomCat) {
//        this.roomCat = roomCat;
//    }
//
//    public int getTerrifCharges() {
//        return terrifCharges;
//    }
//
//    public void setTerrifCharges(int terrifCharges) {
//        this.terrifCharges = terrifCharges;
//    }
//
//    public int getDaysStayed() {
//        return daysStayed;
//    }
//
//    public void setDaysStayed(int daysStayed) {
//        this.daysStayed = daysStayed;
//    }
//    public int CALC(){
//        if(roomCat == "CLUB"){
//          int  tb = daysStayed*2000;
//        }else if (roomCat == "SUIT"){
//          int  tb = daysStayed*5000;
//        } else if (roomCat == "EXECUTIVE"){
//           int tb = daysStayed*1000;
//        }else {
//          int  tb = 0;
//        }
//       // int tb;
//        return tb;
//    }
//    public void PrintDetails(){
//        System.out.println("your room no. is : " + roomNo);
//    }
//}
//
//public class Harshit_pq {
//    public static void main(String[] args) {
//        Hotel hotel = new Hotel();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the room no. :");
//        int _roomNo = sc.nextInt();
//        hotel.setRoomNo(_roomNo);
//        System.out.println(hotel.getRoomNo());
//
//        System.out.println("enter the no. of days stayed");
//        int _daysStayed = sc.nextInt();
//        hotel.setDaysStayed(_daysStayed);
//        System.out.println(hotel.getDaysStayed());
//
////        System.out.println("enter the category");
////        String _roomCat = sc.nextLine();
////        hotel.setRoomCat(_roomCat);
////        System.out.println(hotel.getRoomCat());
//
////
////        System.out.println(hotel.CALC());
//
//        String i = sc.nextLine();
//      //  System.out.println(i);
//        System.out.println("enter the category");
//      //  String _roomCat = sc.nextLine();
//        hotel.setRoomCat(i);
//        System.out.println(hotel.getRoomCat());
//
//        hotel.PrintDetails();
//
//
//
//
//
//
//
//
//        //   System.out.println(hotel.CALC());
//
//
//    }
//}
//
////    Scanner sc = new Scanner(System.in);
////        System.out.println("enter height");
////                int a = sc.nextInt();
////                Cylinder myCy = new Cylinder();
////                myCy.setHeight(a);
////                int h=  myCy.getHeight();
////                System.out.println(h);
////                myCy.setRadius(9);
////                int r = myCy.getRadius();
////                System.out.println(r);
////                System.out.println("sa: "+myCy.SA());
////                System.out.println("a: " + myCy.A());