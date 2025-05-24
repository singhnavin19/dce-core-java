package basic.java8.predifine;

import java.util.function.Function;

public class FunctionImple {
    static Function<String,Integer> stringToNumber=(noInString)->{
        int result=0;
        try{
            result=Integer.valueOf(noInString);
        }catch (Exception e){
            System.out.println("Exception Occured");
        }
        return result;
    };

    public static void main(String[] args) {
        int result=stringToNumber.apply("100");
        System.out.println(result);

        System.out.println(stringToNumber.apply("200"));
        System.out.println("remaining code");

    }
}
