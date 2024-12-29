package basic.oops.inheritance;

public class GermanShefad extends Dog{
    public static void main(String[] args) {
        Dog germanShefad=new GermanShefad(); //parent class can refer child class object

        germanShefad.barking();
        germanShefad.sound();
        System.out.println(germanShefad.legs);
        System.out.println(germanShefad.hand);
    }
}
