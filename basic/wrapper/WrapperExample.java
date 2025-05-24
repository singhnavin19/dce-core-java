package basic.wrapper;

import java.util.List;

public class WrapperExample {
    public static void main(String[] args) {
        int i=10;
        Integer j=i; //AutoBoxing

        int k=j; //UnBoxing
        System.out.println(Integer.compare(100,40));
        System.out.println(Integer.max(10,2));


    }
}
