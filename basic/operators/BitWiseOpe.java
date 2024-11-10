package basic.operators;

import java.util.StringJoiner;

public class BitWiseOpe {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a>b||b>a); //

        System.out.println(new StringJoiner("/").add("Navin").add("Singh").add("Hello"));

    }
}
