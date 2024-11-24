package src.main.com.basic.accessmodifiers1;

import src.main.com.basic.accessmodifiers.BasePrivate;

public class AccessModMain extends BasePrivate{
    public static void main(String[] args) {
        BasePrivate b1=new BasePrivate();
        System.out.println(b1.publicI);
//        System.out.println(b1.protectedI);

        AccessModMain m1=new AccessModMain();
        System.out.println(m1.protectedI);
        m1.printEvenOddNumberprotected();
    }
}
