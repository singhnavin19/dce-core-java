package com.basic.exceptions;

import java.io.File;
import java.io.FileReader;

public class BasicException {
     Exception e1; // instance  //null
     int i;// instance 0
    public static void main(String[] args) {
        System.out.println("hello");
        //compile
        File file=new File("abc.txt");
        try{
            FileReader fileReader=new FileReader(file);
        }catch (Exception e){
           e.printStackTrace();
            System.out.println(e.toString());
        }
  //Runtime
        try{
            System.out.println("catch"+new BasicException().e1.toString());
        }catch (Exception e){
            System.out.println("catch block 2");
        }
        System.out.println("end");
    }
}
