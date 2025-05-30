package basic;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your no1");
        int no1 =sc.nextInt(); //progammer  //user

        System.out.println("please enter no2");
        int no2=sc.nextInt();

        int sum=no1+no2;
        System.out.println("Addition of "+no1+" and "+no2 +" is"+sum);

    }
}
