package com.company;

class MyEmployee{
  private   int id;
   private String name;

   public String getName(){
       return name;
   }

   public void setName(String n){
      this.name = n;
   }
   public void setId(int i){
       this.id=i;
    }
   public int getId(int i){
       return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {

        MyEmployee khari = new MyEmployee();
       // khari.id = 45;
      //  khari.name = "code with khari";
        khari.setName("code with khari");
        System.out.println(khari.getName());

    }
}
