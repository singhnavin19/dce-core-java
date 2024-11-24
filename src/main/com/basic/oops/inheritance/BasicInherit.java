package src.main.com.basic.oops.inheritance;
import src.main.com.basic.oops.pkg.BasicPackage1;
import src.main.com.basic.oops.pkg.BasicPackage1;

class Parent1{
    public void printPackg1(){
        BasicPackage1 p1=new BasicPackage1();
        System.out.println(p1.no1);
    }
    int parentVariable =10;
}
class Child1 extends Parent1{
    int childVariable=20;
}
public class BasicInherit {
    public static void main(String[] args) {
        Parent1 p1=new Parent1();
        System.out.println(p1.parentVariable);
        p1.printPackg1();

        Child1 c1=new Child1();
        System.out.println(c1.parentVariable);
        System.out.println(c1.childVariable);


    }

}
