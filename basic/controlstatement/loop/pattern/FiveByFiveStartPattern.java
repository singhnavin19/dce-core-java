package basic.controlstatement.loop.pattern;

public class FiveByFiveStartPattern {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){//row=2
            for(int col=1;col<=row;col++){ //col=1
                System.out.print(""+"*");
            }
            System.out.println();
        }
    }
}
////o/p
//* * *
//* * *
//* * *
//* * *
