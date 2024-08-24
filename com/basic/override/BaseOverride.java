package com.basic.override;

interface Base {
    //access returType
     void describe();
//    {
//        System.out.println("I am base class  " +
//                "I have basic properties");
//    }
}
class Derived implements Base{
    @Override
    public void describe(){
        System.out.println("""
                I am not basic 
                I am advance """);
    }
}

public class BaseOverride {
    public static void main(String[] args) {
        Base d=new Derived();
        d.describe();
    }
}
