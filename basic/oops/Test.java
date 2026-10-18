package basic.oops;

import java.util.Random;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        int y=0,c,X;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter value of c");
        c=scanner.nextInt();
        System.out.println("please enter value of X");
        X=scanner.nextInt();

        y=(int)Math.pow(c,2)+4*X;

        System.out.println("result of c*2+4*x ="+y);

    }
}

