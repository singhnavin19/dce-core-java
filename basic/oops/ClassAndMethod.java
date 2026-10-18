package basic.oops;

public class ClassAndMethod {
    float markPercentage=10.34f;

    public ClassAndMethod(){
         System.out.println("constructor");
    }

    public void sayeHello(){
        System.out.println("Hello");
    }
    static void main(String[] args) {
        System.out.println("line14");
        ClassAndMethod obj1=new ClassAndMethod(); //object
        System.out.println("line16");
        System.out.println(obj1.markPercentage); //ibj.varName
        obj1.sayeHello(); //obj.methodName
    }
}
