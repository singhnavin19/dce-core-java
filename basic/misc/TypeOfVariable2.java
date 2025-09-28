package basic.misc;

public class TypeOfVariable2 {
    int i=10;

    void printVar(int i){
        System.out.println("i= "+i+ " this.i= "+ this.i);
    }
    static void main(String[] args) {
        TypeOfVariable2 typeOfVariable2=new TypeOfVariable2();
        typeOfVariable2.printVar(30);
        System.out.println(typeOfVariable2.i);
    }
}
