package com.basic.wrapperclass;

public class BasicWrapper {
    public static void main(String[] args) {
        int i=10;//primitive
        System.out.println(i);

        Integer i1=i; //wrapper class AutoBoxing
        i1++;
        System.out.println(i1);

        int j=i1;//AutoUnboxing


    }
}
