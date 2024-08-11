package com.basic.oops.interfaces;

abstract class AbcAbstract{
//    public void printEvenOdd(){
//        for(int i=0;i<=20;i++){
//            if(i%2==0){
//                System.out.println("even number ="+i);
//            }else{
//                System.out.println("Odd Number= "+i);
//            }
//        }
//    }
    abstract void sayHello();
}

public class BasicAbstractExample extends AbcAbstract{
    public static void main(String[] args) {
        BasicAbstractExample b=new BasicAbstractExample();
        b.sayHello();
    }
    @Override
    void sayHello(){
        System.out.println("Namaskar Sir");
    }
}
