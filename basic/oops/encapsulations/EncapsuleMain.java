package basic.oops.encapsulations;

public class EncapsuleMain {
    public static void main(String[] args) {
        Encapsule en=new Encapsule();
        System.out.println(en.getI());
        en.setI(20);
        System.out.println(en.getI());
    }
}
