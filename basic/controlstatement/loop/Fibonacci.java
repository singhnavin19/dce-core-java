package basic.controlstatement.loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("please enter upto which number fibonacci series");
        int uptoNumber=new Scanner(System.in).nextInt();
        int no1=0;
        int no2=1;
        int no3=no1+no2;//0+1 ==1
        System.out.print(no1+ " " +no2+" "+no3); //0 1 1
        while(true){ //1>50
            no1=no2;
            no2=no3;
            if(no1+no2>uptoNumber){
                break;
            }
            no3=no1+no2;

            System.out.print(" " +no3);
        }
        System.out.println("last number 3= "+no3);

    }
}
