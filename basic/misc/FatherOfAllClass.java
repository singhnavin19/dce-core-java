package basic.misc;

public class FatherOfAllClass extends Object{
    int no=10;
    static void main(String[] args) {
        FatherOfAllClass all=new FatherOfAllClass();
        System.out.println(all.no);
        System.out.println(all.getClass());
//        System.out.println(all.clone());
        System.out.println(all.equals(all));
        System.out.println(all.hashCode());
        System.out.println(all.toString());
//        System.out.println(all.notify());
    }
}
