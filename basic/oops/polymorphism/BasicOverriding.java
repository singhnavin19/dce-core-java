package basic.oops.polymorphism;
abstract class A{
       public abstract  void hi();
        }
class B extends A{
    public void hi(){
       System.out.println("hi");
    }
}

public class BasicOverriding {
    public static void main(String[] args) {
        A a=new B();
        a.hi();
    }
}
