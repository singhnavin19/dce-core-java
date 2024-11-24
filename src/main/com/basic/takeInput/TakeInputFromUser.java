package src.main.com.basic.takeInput;

import java.io.BufferedReader;
import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Please enter your number");
//        int i=sc.nextInt();

        System.out.println("Enter Your name ");
        String name =sc.nextLine();

        System.out.println("entered name is "+name);


    }
}
