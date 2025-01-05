package basic.oops.abstarctionss;

import com.sun.tools.javac.Main;

public class MainAbstarct extends AbstarctBasicExample {
    MainAbstarct(){
        System.out.println("constructor of MainAbstarct");
    }

    public static void main(String[] args) {
        AbstarctBasicExample basicExample = new MainAbstarct();
        basicExample.sayHello();
    }
    public void sayBye() {
        System.out.println("Bye Bye");
    }
}
