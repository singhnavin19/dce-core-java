package src.main.com.basic.oops.interfaces;
abstract  class Abc{
    public void printNumbers(){
        for (int i=0;i<=10;i++){
            System.out.println("number is "+i);
        }
    }
    public  abstract void  nobodyMethod();
}
class Hello{}
public interface BasicInterface {
    int i=10;
    void nobodyMethod();
}
class Ghi implements BasicInterface{
    @Override
    public void nobodyMethod() {

    }
}
class AbcDE extends Abc{
    @Override
    public void nobodyMethod() {

    }
}