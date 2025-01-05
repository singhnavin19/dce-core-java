package basic.oops.abstarctionss;

public abstract class AbstarctBasicExample {
    final int  i;

    AbstarctBasicExample(){
        i=10;
        System.out.println("constructor AbstarctBasicExample");
   }
    public void sayHello(){
        System.out.println("Hello from abstarct class");
    }
    public abstract void sayBye();
}
