package basic.oops.interfcae11;

public class HelloByeBye implements HelloInterface,ByeByeInterface{
    @Override
    public void bybye() {
        System.out.println("Bye Bye");
    }
    @Override
    public void hello() {
        System.out.println("Hello Hello");
    }
    static void main(String[] args) {
        HelloByeBye helloByeBye=new HelloByeBye();
        helloByeBye.hello();
        helloByeBye.bybye();
    }
}
