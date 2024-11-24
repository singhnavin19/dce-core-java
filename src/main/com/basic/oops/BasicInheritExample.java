package src.main.com.basic.oops;
interface Student {
    int id=1;
    void name();
}
class ReagularStudent implements Student{
    @Override
    public void name(){
        System.out.println("My name is XYZ");
    }
}
class Niraj{
//    @Override
//    public String toString(){
//        return null;
//    }
}

public class BasicInheritExample {
    public static void main(String[] args) {
        BasicInheritExample b=new BasicInheritExample();
//        System.out.println(b); //
//        System.out.println(b.toString()); //
        Niraj n=new Niraj();
        System.out.println(n);
        System.out.println(n.toString());


        String s=new String("Navin");
//        System.out.println(s);
//        System.out.println(s.toString());
////        System.out.println(b.hashCode());

    }
}
