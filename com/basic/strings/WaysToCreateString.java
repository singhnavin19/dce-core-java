package com.basic.strings;

public class WaysToCreateString {
    public static void main(String[] args) {
        String s1="Navin1";
        String s2 ="Navin1";

        System.out.println("s1.hashCode()="+ s1.hashCode());
        System.out.println("s2.hashCode()"+s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

//        String s3=new String("Navin2");
//        String s4=new String("Navin2");
//        System.out.println("s3.hashCode()="+s3.hashCode());
//        System.out.println("s4.hashCode()="+s4.hashCode());
//        System.out.println(s3==s4);
//        System.out.println("(s3.equals(s4)) ="+s3.equals(s4));

    }
}
