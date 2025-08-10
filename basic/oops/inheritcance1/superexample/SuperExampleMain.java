package basic.oops.inheritcance1.superexample;

class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
    int money=100000;
    public void myCar(){
        System.out.println("parent car color is red");
    }
}
class Child1 extends Parent{
    Child1(){
        super();
        System.out.println("Child 1 constructor");
    }
    int money=20000;
    @Override
    public void myCar(){
        System.out.println("Child1 car is color is green");
        super.myCar();
    }
    public void showMoney(){
        System.out.println("my money="+money+
                "intermediate parent money="+super.money);
    }
}
public class SuperExampleMain {
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.showMoney();
        child1.myCar();

    }

}
