package src.main.com.basic.loops;

import java.util.Scanner;

public class LoopBasic {
    public static void main(String[] args) {
        System.out.println("Please enter your number for table");
        int number=new Scanner(System.in).nextInt();
        int i=1;
        do{
            System.out.println(number*i);
            i++;
        }
        while(i<=10);
//        for(int i=1;i<=10;i++){
//            System.out.println(number*i);
//        }

    }
}
