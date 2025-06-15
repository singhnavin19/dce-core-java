package basic.controlstatement;

import java.util.Scanner;

public class FooBaarIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number");
        int no=sc.nextInt();

        System.out.println("entered number is "+no);
        if(no%5==0) {
            System.out.println("foo ,it's completely divisible by 5");
        }
        if(no%5!=0) {
            System.out.println("baar");
        }

    }
}
