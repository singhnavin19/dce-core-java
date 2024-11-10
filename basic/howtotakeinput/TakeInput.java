package basic.howtotakeinput;


import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your pin code");
        int pinCode= sc.nextInt();

        System.out.println("pincode is "+pinCode);
    }
}
