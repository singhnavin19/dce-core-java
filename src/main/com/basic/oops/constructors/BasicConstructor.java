package src.main.com.basic.oops.constructors;

import java.util.Scanner;
public class BasicConstructor {
    int i;
    public void BasicConstructorMethod(){
        System.out.println("I am method ");
    }

    public BasicConstructor(int i){
        System.out.println("I am a constructor with value "+ i);
    }
    public static void main(String[] args) {
        System.out.println("hello");
//        BasicConstructor atharva=new BasicConstructor();
//        atharva.BasicConstructorMethod();
        BasicConstructor obj2=new BasicConstructor(10);

        BasicConstructor obj3=new BasicConstructor('h');
    }
}
