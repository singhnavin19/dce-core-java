package com.basic.variabletypes;

public class InstanceVarExample {
    //var
    static  float floatStatic=10.34f;  //instance objectlevl
    float floatInstance=30.34f;

    protected InstanceVarExample(){
        System.out.println("default constructor or no args constructor");
    }
    protected InstanceVarExample(String name){
        System.out.println("constructor name ="+name);
    }
    protected InstanceVarExample(int i){
        System.out.println("constructor name ="+i);
    }

    public void printFullName(String firstName,String lastName){ //static
        int i; //local or method level var
        for(i=0;i<=5;i++){
            System.out.println("full name is "+firstName+lastName);
        }
    }
    public void printFullName(String firstName){ //static
        System.out.println("full name is "+firstName);
    }

    public static void main(String[] args) {
        InstanceVarExample ibj1=new InstanceVarExample("anjali");
        InstanceVarExample ibj2=new InstanceVarExample(12);

//        System.out.println(floatStatic);
//        InstanceVarExample e1=new InstanceVarExample();
//        System.out.println(e1.floatInstance);
//        e1.printFullName("Navin","Singh");
//        e1.printFullName("Omkar");
    }

}
