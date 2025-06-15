package basic.controlstatement;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        int age=new Scanner(System.in).nextInt();
        if (age>=80) {
            System.out.println("super senior");
        }
        else if(age>=60){
            System.out.println("senior");
        }
        else if(age>=18){
            System.out.println("you are adult");
        }
        else {
            System.out.println("enjoy , you are child");
        }


    }
}
