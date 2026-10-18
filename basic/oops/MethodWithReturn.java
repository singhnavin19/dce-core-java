package basic.oops;

public class MethodWithReturn {
   int x=10;
    public double piyush(int x,double y){
        System.out.println(x);
        double result=x-77.67;
        return result;
    }

    static void main(String[] args) {
        MethodWithReturn obj1=new MethodWithReturn();

        MethodWithReturn obj2=new MethodWithReturn();
        System.out.println(obj2.x);
        obj2.x=30;
        System.out.println("after change obj2.x"+obj2.x);

        System.out.println("obj1.x="+obj1.x);

    }
}
