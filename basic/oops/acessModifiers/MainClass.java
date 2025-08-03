package basic.oops.acessModifiers;

import basic.oops.basicoops.StudentA;

public class MainClass {

    private static int j=10;
    public static void main(String[] args) {
        StudentA s=new StudentA();
        s.displayStudentName("Navin");
        System.out.println(j);
        System.out.println(s.a);

    }
}
