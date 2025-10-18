package basic.exceptionsss;

import java.util.Scanner;

public class CustomCheckedException {
    public  static void checkAge() throws Exception{
        System.out.println("please enter your age");
        int age=new Scanner(System.in).nextInt();
        if(age>18){
            System.out.println("Eligible for voting");
        }else{
           throw new VotingEligibility("you are not eligible for voting");
        }


    }

    static void main(String[] args) {
        try {
            checkAge();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
