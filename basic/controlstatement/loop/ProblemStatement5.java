package basic.controlstatement.loop;

import java.util.Scanner;

public class ProblemStatement5 {
    public static void main(String[] args) {
        System.out.println("please enter your input");
        int input=new Scanner(System.in).nextInt(); //1234
        int result=0;
        while (input > 0){ //1>0 true
            int remainder=input%10; //1
            result=result*10+remainder; //0*10+4= 4*10+3=43 43*10+2=432 432*10+1=4321
            input=input/10; //1/10=0
        }
        System.out.println("reversed number is ="+result);
    }
}
