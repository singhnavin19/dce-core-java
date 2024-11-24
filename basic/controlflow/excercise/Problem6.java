package basic.controlflow.excercise;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int input;
        System.out.println("Please enter your number i will reverse it");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        int sum=0;

        while(input>0){ //12345
           int modulusResult=input%10; //5
            sum=sum*10+modulusResult;//5
            input=input/10;
        }
        System.out.println(sum);
    }
}
