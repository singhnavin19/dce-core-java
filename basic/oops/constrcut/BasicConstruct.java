package basic.oops.constrcut;

public class BasicConstruct {
    BasicConstruct(){ //
        System.out.println("I am constructor");
    }

    public void add(int i,int j){
        System.out.println("addition is "+(i+j));
    }

    public static void main(String[] args) {
        System.out.println("main method");
        BasicConstruct basicConstruct=new BasicConstruct();
//        basicConstruct.add(10,20);
    }
}
