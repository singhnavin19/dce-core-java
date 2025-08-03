package basic.oops.inheritcance1.SongleLevel;

public class Chiild1 extends Parent{
    int money=200000000;
    @Override //Annotation
    public void myHome(){
        System.out.println("I have modified my parent's Home");
    }

    public void myNewHome(){
        System.out.println("I am living in my own home ");
    }

    public void printChildMoney(){
        System.out.println(money);
    }
    public void printParentMoney(){
        System.out.println(super.money);
    }
    public void totalMoney(){
        System.out.println(money+super.money);
    }
}
