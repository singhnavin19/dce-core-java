package com.basic.strings;

import javax.management.ObjectName;

class OmkarP{

}
public class StringBasicExample {
    public static void main(String[] args) {
        String s="Navin";
        String s1="Navin";
        System.out.println(s.length());
        System.out.println(s1.length());

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s1.equals(s));
        System.out.println(s==s1);

    }
}
