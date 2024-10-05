package com.adv.finals;

public class BasicFinalExample {
    final int i;
    BasicFinalExample(){
        i=10;
    }
    public static void main(String[] args) {
        System.out.println(new BasicFinalExample().i);
    }
//    static {
//        System.out.println("hello");
//        i=10;
//    }
}
