package basic.conditional;

public class ConditionalSwitch {
    static void main(String[] args) {
        int no=Integer.valueOf(IO.readln("Please enter your number 1 to 5"));
        switch (no){
            case 1: //if no==1
                System.out.println("Case One");
                break;
            case 2:
                System.out.println("case Two");
                break;
            case 3:
                System.out.println("Case Three");
                break;
            case 4:
                System.out.println("Case Four");
                break;
            case 5:
                System.out.println("Case Five");
                break;
            default:
                System.out.println("No is not between 1 to 5");
        }


        if(no==1){
            IO.println("One");
        }else if (no==2){
            IO.println("Two");
        } else if (no==3) {
            System.out.println("Three");
        } else if (no==4) {
            System.out.println("Four");
        } else if (no==5) {
            System.out.println("Five");
        }else {
            System.out.println("number is not between 1 to 5");
        }


    }
}
