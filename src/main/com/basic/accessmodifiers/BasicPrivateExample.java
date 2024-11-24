package src.main.com.basic.accessmodifiers;
public class BasicPrivateExample {
    private int j=20;
    public static void main(String[] args) {
        BasePrivate b1=new BasePrivate();
        System.out.println(b1.getI());
        System.out.println(b1.defaultI);
        System.out.println(b1.protectedI);

        BasicPrivateExample obj1=new BasicPrivateExample();
        System.out.println(obj1.j);
    }
}
