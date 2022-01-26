package com.company;

    interface MyCamera{
        void  takeSnap();
        void recordVideo();
        private void greet(){
            System.out.println("good morning");
        }
       default void record4kVideo(){
           greet();
           System.out.println("recording in 4k");

       }
        }

        interface MyWifi{
        String [] getNetworks();
        void connectToNetwork(String network);

        }

        class MyCellPhone {
        void callNumber(int phoneNumber){
            System.out.println("calling"+ phoneNumber);
        }
        void pickNumber(){
            System.out.println("connecting...");
        }
    }
    class MySmartPhone
            extends MyCellPhone
            implements MyWifi, MyCamera{
      public   void takeSnap(){
            System.out.println("taking snap");
        }
        public void recordVideo(){
            System.out.println("recording video");
        }
        public String[] getNetworks(){
            System.out.println("getting list of networks");
            String[] networkList = {"idea", "airtel", "jio"};
            return networkList;
        }
        public void connectToNetwork(String network){
            System.out.println("connecting to "+ network);
        }
    }

public class cwh_54_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
      String[] ar =  ms.getNetworks();
        for (String item : ar){
            System.out.println(item);

        }
    }
}
