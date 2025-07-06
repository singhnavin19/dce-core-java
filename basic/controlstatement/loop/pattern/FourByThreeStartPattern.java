package basic.controlstatement.loop.pattern;

public class FourByThreeStartPattern {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){//row=2
            for(int col=1;col<=10;col++){ //col=1
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
