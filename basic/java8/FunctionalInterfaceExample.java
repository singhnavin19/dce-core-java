package basic.java8;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    int add(int no1,int no2);

    default void addThreeNos(int a,int b,int c){
        System.out.println(a+b+c+" = result ");
    }

}
