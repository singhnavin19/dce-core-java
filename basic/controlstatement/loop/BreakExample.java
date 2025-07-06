package basic.controlstatement.loop;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        System.out.println("please enter your number upto 1000");
        int i=new Scanner(System.in).nextInt();
        int no=1;
        for(;no<=10;no++){ //no=10
            if(no==i){               //10==10
                continue;
            }
            System.out.println(no);  //10
        }
        System.out.println("body ke bahar no="+no);
    }
}
