package basic.oops.interfcae11;

import java.util.Scanner;

public class MainClassInterface {
    static void main(String[] args) {
        System.out.println("please enter your choice \n 1, Hindi \n 2.English");
        int language=new Scanner(System.in).nextInt();
        HelloInterface helloInterface=null; ;

        switch (language){
            case 1:
                   helloInterface=new HelloInHindi();
                   break;
            case 2:
                helloInterface=new HelloInEnglish();
                break;
            default:
                System.out.println("no hello bahar chalo");
        }
        if(helloInterface!=null){
            helloInterface.hello();
        }

    }
}
