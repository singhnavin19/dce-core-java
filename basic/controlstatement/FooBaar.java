package basic.controlstatement;

import java.util.Scanner;

public class FooBaar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number");
        int no=sc.nextInt();
        if(no%5==0 && no%3==0){ //F F --> F
            System.out.println("foo baar");
        }
        else if(no%5==0){ //F
            System.out.print("foo");
        }
        else if(no%3==0){
            System.out.print(" baar");
        }
        else{
            System.out.println("no foo baar");
        }

    }
}
