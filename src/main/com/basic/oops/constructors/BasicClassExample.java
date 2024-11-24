package src.main.com.basic.oops.constructors;

public class BasicClassExample {
     int no=10;

     void printMyName(){
        System.out.println("Navin Singh");
    }
    static public void main(String[] args) {
        BasicClassExample basicClassExample=new BasicClassExample();
        System.out.println("initial value in basicClassExample ="+basicClassExample.no); //10
        basicClassExample.no=11;
        System.out.println(basicClassExample.no);
        basicClassExample.printMyName();

        BasicClassExample basicClassExample2=new BasicClassExample();
        System.out.println(basicClassExample2.no);
        basicClassExample2.printMyName();
    }
}
