package basic.controlflow.jumandbreak;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        System.out.println("how many number you want to print upto 40");
        int choice=new Scanner(System.in).nextInt();

        for(int no=1;no<=40;no++){
            if(choice==no){
                continue;
            }
            System.out.println(no +" ");
        }
    }
}
