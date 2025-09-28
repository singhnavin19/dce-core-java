package basic.misc;

public class TypeOfVariable {

    //instance variable =wo variables jo class ke andar but method ke bahar
    int instanceVar=10;
    void printVariable(){
        int localVar=20;
        instanceVar++;
        System.out.println("instanceVar="+instanceVar);
        System.out.println("LocalVar="+localVar);
    }

    void printVariable2(){
        System.out.println(instanceVar);
    }
    static void main(String[] args) {
        TypeOfVariable typeOfVariable =new TypeOfVariable();
        typeOfVariable.printVariable();
        typeOfVariable.printVariable();

    }
}
