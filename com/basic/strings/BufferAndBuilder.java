package com.basic.strings;

public class BufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("Navin");
        builder.append(" Singh");
        System.out.println(builder);

        //reverse string using builder
        String s="navin";
        System.out.println(new StringBuilder(s).reverse());

        //using buffer
        StringBuffer buffer=new StringBuffer("Navin Singh");
        System.out.println(buffer.reverse());



    }
}
