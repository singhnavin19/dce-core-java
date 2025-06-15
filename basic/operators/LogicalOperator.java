package basic.operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10,b=20;
        int c=1,d=0;

        System.out.println(a>b && c>d);// 10>20  false false  false
        System.out.println(a>b || c>d);// 10>20  false false  false

        System.out.println(!true);
        System.out.println(true||false);
    }
}
