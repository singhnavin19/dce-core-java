package com.basic.oops;

public class BasicConstructor {
    public void BasicConstructor(){
        System.out.println("I am method ");
    }
    public BasicConstructor(){
        System.out.println("I am a constructor ");
    }
    public BasicConstructor(int i){
        System.out.println("I am a constructor with value "+ i);
    }
    public static void main(String[] args) {
        System.out.println("hello");
        BasicConstructor obj1=new BasicConstructor();
        obj1.BasicConstructor();
        BasicConstructor obj2=new BasicConstructor(10);

        BasicConstructor obj3=new BasicConstructor('h');
    }
}
