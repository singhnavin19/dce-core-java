package basic.controlstatement.descision;

import java.util.Scanner;

public class DynamicStudent {
    public static void main(String[] args) {
        System.out.println("Please enter your age ");
        int age =new Scanner(System.in).nextInt();

        if(age>=18){
            if(age<60){
                System.out.println("adult");
            }
            if(age<= 70){
                System.out.println("senior citizen");
            }
            if(age>=70){
                System.out.println("super senior citizen");
            }
        }else {
            if(age>=14){
                System.out.println("teen");
            }
           else {
                System.out.println("child");
            }

        }

    }
}
