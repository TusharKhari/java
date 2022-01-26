package com.company;

import java.util.*;

public class cwh_91_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(2);

        l1.addAll(l2);
      //  l1.clear();
//        System.out.println(l1.get(3));
//        for (int i = 0; i< l1.size(); i++){
//            System.out.println(l1.get(i));
//        }
//        System.out.println("the size of an array "+ l1.size());
        System.out.println(l1.contains(90));
    }
}