package basic.controlstatement.loop;

import java.util.Scanner;

public class ProblemStatement8 {
    public static void main(String[] args) {
        System.out.println("please enter your input");
        int input=new Scanner(System.in).nextInt();

        if(input<=0){
            System.out.println("please enter positive number as a input");
        }else {
            System.out.println("correct input .. processing the same");
        }

        for(int divideNo=2;divideNo<input;divideNo++){ //9
            if(input%divideNo==0){ // 1
                System.out.println("it's not prime number as it's divisible by "+divideNo);
                break;
            }
        }
    }
}
