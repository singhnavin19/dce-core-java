package basic.controlflow.descionmaking;

//1=One
//2=Two
//3=Three
//4- Four

import java.util.Scanner;

public class ConvertCapitalToSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number");
        int no=sc.nextInt();
        switch (no){
            case 1:  //if(no==1)
                System.out.println("One");
                break;
            case 2://if(no==2)
                System.out.println("Two");
                break;
            default:
                System.out.println("Mai hu default sab kuch nhi match hoga tab mai aaunga ");
        }

//        if(no==1){
//            System.out.println("One");
//        }else if(no==2){
//            System.out.println("two");
//        }else if (no==3){
//            System.out.println("Three");
//        }

    }

}
