package basic.oops;

public class MethodWithReturn {

    public double piyush(int x,double y){
        System.out.println(x);
        double result=x-77.67;
        return result;
    }

    static void main(String[] args) {
        MethodWithReturn obj1=new MethodWithReturn();
        double r=obj1.piyush(100,300);
        System.out.println("return "+r);

    }
}
