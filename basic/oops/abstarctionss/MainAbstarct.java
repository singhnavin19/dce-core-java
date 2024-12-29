package basic.oops.abstarctionss;

import com.sun.tools.javac.Main;

public class MainAbstarct extends AbstarctBasicExample {
    public static void main(String[] args) {
        AbstarctBasicExample basicExample = new MainAbstarct();
        basicExample.sayHello();
    }
    public void sayBye() {
        System.out.println("Bye Bye");
    }
}
