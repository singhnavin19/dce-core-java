package basic.oops.basicoops;

public class MathExample {
    int no1;
    int no2;

    public void add(){
        System.out.println("Addition of no1 and no2= "+(no1+no2));
    }
    public void substract(){
        System.out.println("Substraction of no1 and no2="+(no1-no2));
    }
    public void multiply(){
        System.out.println("Multiplication is "+(no1*no2));
    }

    public static void main(String[] args) {
        MathExample m1=new MathExample();
        MathExample m2=new MathExample();
        MathExample m3=new MathExample();

        System.out.println(m1.no1);//0
        m1.add();
        m1.no1=10;
        m1.no2=40;
        m1.add();
        m1.substract();
        m1.multiply();

        m2.add();
//
//        System.out.println("m2.no1= "+m2.no1); //
//

    }
}
