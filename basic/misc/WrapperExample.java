package basic.misc;

public class WrapperExample {
    static void main(String[] args) {
        int i=10;
        System.out.println(i);
        Integer j=i; //AutoBoxing
        System.out.println(j);
        j++;
        System.out.println(i);
        System.out.println(j);
    }
}
