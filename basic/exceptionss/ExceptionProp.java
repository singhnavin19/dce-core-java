package basic.exceptionss;

public class ExceptionProp {
    void a() {
        try {
            b();
        } catch (Exception e) {
        }
        System.out.println("remaining code of a");
    }

    void b() {
        c();
        System.out.println("remaining code of b");
    }

    void c() {
        System.out.println(10 / 0);
        System.out.println("remaining code of C");
    }

    public static void main(String[] args) {
        ExceptionProp p = new ExceptionProp();
        p.a();
    }
}
