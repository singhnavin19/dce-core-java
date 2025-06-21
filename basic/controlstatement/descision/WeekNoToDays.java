package basic.controlstatement.descision;

import java.util.Scanner;

public class WeekNoToDays {
    public static void main(String[] args) {
        System.out.println("please enter your weekDay No");
        int no=new Scanner(System.in).nextInt();

        if(no==1){
            System.out.println("Monday");
        } else if (no==2) {
            System.out.println("Tuesday");
        } else if (no==3) {
            System.out.println("Wednesday");
        } else if(no==4){
            System.out.println("Thursday");
        } else if (no==5) {
            System.out.println("Friday");
        } else if (no==6) {
            System.out.println("Saturday");
        } else if (no==7) {
            System.out.println("Sunday");
        } else{
            System.out.println("Please enter valida day No between 1 to 7");
        }


    }
}
