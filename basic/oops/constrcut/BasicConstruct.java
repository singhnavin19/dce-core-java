package basic.oops.constrcut;

public class BasicConstruct {
    BasicConstruct() { //
        System.out.println("I am constructor");
    }

    BasicConstruct(String name) {
        System.out.println("I am constructor and name is " + name);
    }

    BasicConstruct(int no) {
        System.out.println("I am constructor and name is " + no);
    }

    BasicConstruct(int no, String name) {
        System.out.println(" I am cons" + no + " " + name);
    }

    BasicConstruct(char no, char c) {
        System.out.println("char no,char c");
    }

    BasicConstruct(int no, int c) {
        System.out.println("int no,int c" + no + " " + c);
    }

    public void add(int i, int j) {
        System.out.println("addition is " + (i + j));
    }

    public static void main(String[] args) {
        System.out.println("main method");
        BasicConstruct basicConstruct = new BasicConstruct();
        BasicConstruct basicConstruct1 = new BasicConstruct("navin");
        BasicConstruct basicConstruct2 = new BasicConstruct(10, "Navin");
//        BasicConstruct basicConstruct2=new BasicConstruct("Navin",20);
        new BasicConstruct(10, 'c');
        new BasicConstruct('c', 10);
        new BasicConstruct('c', 'c');

        basicConstruct.add(10, 20);
    }
}
