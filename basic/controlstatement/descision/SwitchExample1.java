package basic.controlstatement.descision;

import java.util.Scanner;

public class SwitchExample1 {

    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();

        switch (input){
            case 1://input==1
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("please enter your number between 1 to 3");
        }

    }
}
