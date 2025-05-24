package basic.exceptionss;

import java.util.Scanner;

public class FinalExample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        int no3=0;
        try{
            no3=no1/no2;
        }catch (Exception e){
            System.out.println("Exceptions occured");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("result is "+no3);
        System.out.println("remaining code");
    }
}
