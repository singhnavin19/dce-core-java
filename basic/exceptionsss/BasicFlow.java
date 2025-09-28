package basic.exceptionsss;

import java.util.Scanner;

public class BasicFlow {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter no1");
        int no1=scanner.nextInt();
        System.out.println("please enter no2");
        int no2=scanner.nextInt();

        System.out.println("division is "+(no1/no2));
        System.out.println("addition is "+(no1+no2));
        System.out.println("substraction  is "+(no1-no2));
    }
}
