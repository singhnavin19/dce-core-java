package basic.java8;

import java.util.function.Consumer;

public class FunctionalImpl implements FunctionalInterfaceExample{
    @Override
    public int add(int no1, int no2) {
        return no1+no2;
    }

    public static void main(String[] args) {

        FunctionalImpl impl=new FunctionalImpl();
        System.out.println(impl.add(10,20));

        FunctionalInterfaceExample fun=new FunctionalInterfaceExample() {
            @Override
            public int add(int no1, int no2) {
                return 0;
            }
        };

    }
}
