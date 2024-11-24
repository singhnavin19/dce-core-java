package src.main.com.basic.polymophism;

public class OverloadingExample {
    public void SayHello(int i,int j){
        System.out.println("hello");
    }
    private void SayHello(int i,double k){
        System.out.println("hello1");;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        OverloadingExample overloadingExample=new OverloadingExample();
        overloadingExample.SayHello(10,20.0);
        overloadingExample.SayHello(10,20);

    }
}
