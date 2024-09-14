package com.basic.strings;

public class StringByUsingNewOperator {
    public static void main(String[] args) {
        String s=new String("Navin");
        String s2="Navin";
        System.out.println(s==s2);
        s=s.intern();
        System.out.println(s==s2);

    }
}
