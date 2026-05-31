package basic;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int no=sc.nextInt();
        int no=Integer.valueOf(IO.readln("please enter yuour number"));

        if(no>0){
            IO.println("Positive");
        } else if (no<0) {
            IO.println("Negative ");
        }else {
            System.out.println("Zero");
        }
    }
}
