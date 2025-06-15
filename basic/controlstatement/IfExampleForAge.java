package basic.controlstatement;

import java.util.Scanner;

public class IfExampleForAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your agr");
        int age=sc.nextInt();

        System.out.println("your age is "+age);

        if(age>=60){ //12>=60 false
            System.out.println("You are senior citizen");
            System.out.println("yahoo");
        }else{
            System.out.println("you are not senior citizen");
        }
    }
}
