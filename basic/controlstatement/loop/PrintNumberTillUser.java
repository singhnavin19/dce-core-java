package basic.controlstatement.loop;

import java.util.Scanner;

public class PrintNumberTillUser {
    public static void main(String[] args) {
        System.out.println("Please enter number jaha tak print karna hai ");
        int tillNumber=new Scanner(System.in).nextInt();
        //100
        for(int i=1;i<=tillNumber;i++){ //2
            System.out.println(i);
        }

    }
}
