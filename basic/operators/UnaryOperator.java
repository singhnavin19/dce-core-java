package basic.operators;

public class UnaryOperator {
    public static void main(String[] args) {

        //++p(pre)  p++(post)  --p p--

        int a=10; //10
        a--; //a=a+1; 9
        System.out.println(a); //9
        a++; //10
        System.out.println(a); //10

        int b=10;
        int c=10+(++b); //11
        System.out.println("++b="+b);

        System.out.println(--b);

//        int c=10;
        System.out.println("jor se bolo="+(c++));


    }
}
