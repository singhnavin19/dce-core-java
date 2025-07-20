package basic.oops.basicoops;

public class MathExample2 {
    public int add(int no1,int no2){
        System.out.println("line no 5");
        return no1+no2;
    }
    public int add(int no1, int no2,int no3){
        System.out.println("line no 9");
        return no1+no2+no3;
    }
    public static void main(String[] args) {
        MathExample2 mathExample=new MathExample2();
        System.out.println(mathExample.add(10,40));
        System.out.println(mathExample.add(45,78,90));

    }
}
