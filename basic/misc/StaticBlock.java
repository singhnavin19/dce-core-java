package basic.misc;

public class StaticBlock {
    static int varr=20;
    StaticBlock(){
        System.out.println("I am constructor");
    }

    static {
        System.out.println("2nd static block"+varr);
    }

    //insatnce block
    {
        System.out.println("gumnam block"+varr);
    }

    static void main(String[] args) {
        StaticBlock staticBlock=new StaticBlock();
        System.out.println("hello from static method"+varr);
    }
    static {
        varr++;
        System.out.println("1 static block"+varr);
    }
}
