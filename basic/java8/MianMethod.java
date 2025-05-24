package basic.java8;

public class MianMethod {
    public static void main(String[] args) {
        FunctionalInterfaceExample fun= (no1,no2) ->no1+no2;
        System.out.println(fun.add(102,200));

        fun=(no1,no2)-> no1+no2+1;
        System.out.println(fun.add(1,2));
        fun.addThreeNos(1,2,3);
    }
}
