package com.company;
import java.util.Locale;

public class cwh_14_stringmethods {
    public static void main(String[] args) {
        String name = "KHari   ";
        int value = name.length();
        String lc = name.toLowerCase();
        String uc = name.toUpperCase();

        System.out.println(name);
        System.out.println(value);
        System.out.println(lc);
        System.out.println(uc);

        String nontrim = "    khari     is    a    ";
        String trim = nontrim.trim();

        System.out.println(nontrim);
        System.out.println(trim);

        System.out.println(value);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('r', 'e'));
        System.out.println(name.replace("r", "e  "));
        System.out.println(name.startsWith("K"));
        System.out.println(name.endsWith(" "));
        System.out.println(name.indexOf("r"));
        System.out.println("\"tom\"");




    }
}
