package basic.controlflow.loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sir bolo kitne times round marna hai ");
        int round=sc.nextInt();
        //for(inituialize;condition check;)
        int i=1; //startcount
         //i=10
        do{
            System.out.println("round"+i);
            i++;
        }while(i<=0);
        System.out.println("remaining code");

    }
}
