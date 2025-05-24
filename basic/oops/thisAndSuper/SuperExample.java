package basic.oops.thisAndSuper;
class SuperClass{
    int i=20;
    public void m1(){
        System.out.println("SuperClass m1 method");
    }
    public void m2(){
        System.out.println("SuperClass m2 method");
    }

        }

public class SuperExample extends SuperClass{
    int i=10;
    public void m1(){
        System.out.println("SuperExample m1 method");
    }
    public void test(){
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        SuperExample superExample=new SuperExample();
        superExample.test();
    }
}
