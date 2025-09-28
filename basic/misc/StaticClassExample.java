package basic.misc;

public class StaticClassExample {
    int instanceVar = 10;

    static void printHello(){
        System.out.println("hello");
    }

    static void main(String[] args) {
        printHello();
        StaticClassExample staticClassExample = new StaticClassExample();
        System.out.println(staticClassExample.staticVar);
        staticClassExample.staticVar++;

        StaticClassExample staticClassExample1 = new StaticClassExample();
        System.out.println(staticClassExample1.staticVar);

    }
    static int staticVar = 20;

}
