package com.basic.variabletypes;
public class Hello {

    public static void main(String[] args) {
        helloNavi h=new helloNavi("Navin","Song");
        System.out.println(h);
    }
    private record helloNavi(String name,String sirname){}

}
