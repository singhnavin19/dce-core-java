package basic.controlstatement.loop;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swap a ="+a+" and b="+b);

        int c=a;
        a=b;
        b=c;

        System.out.println("after swap a ="+a+" and b="+b);


    }
    //a=20 b=10
    //a=a*b;  200
    //b=a/b; 10
    //a=a/b; 200/10
}
