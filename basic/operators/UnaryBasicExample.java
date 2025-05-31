package basic.operators;

public class UnaryBasicExample {
    public static void main(String[] args) {
        System.out.println("Unary Operator");
        int a=10;
        System.out.println("before "+a);
        a++;
        System.out.println("after1 ="+a);
        ++a;
        System.out.println("after2 ="+a);

        System.out.println("--a is= "+--a);//11
        System.out.println(a--); // 11 10
        System.out.println(a);    //
    }
}
