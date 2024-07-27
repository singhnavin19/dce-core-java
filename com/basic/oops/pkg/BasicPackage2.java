package com.basic.oops.pkg;

public class BasicPackage2 {
    int no2=20; // instance
    static int no3=30; //static
    public static void main(String[] args) {
        BasicPackage2 dev=new BasicPackage2();
        System.out.println("dev no2= "+dev.no2);
        dev.no2=11;
        System.out.println("new value for dev no2="+dev.no2);
        System.out.println("dev no3 ="+no3);
        no3=220;
        System.out.println("dev no3=" +no3);

        BasicPackage2 obj2=new BasicPackage2();
        System.out.println("obj2 no2="+ obj2.no2);
        System.out.println("obj2 no3="+obj2.no3);

    }
}
