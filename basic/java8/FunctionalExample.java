package basic.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Fun1{
    int i=10;
    void sayHello(String s);
}


public class FunctionalExample{
    public static void main(String[] args) {
//        List<String> names= List.of("A","B","C");
        List<String> names= Arrays.asList("A","B","C");

        Predicate<String> isAvailable=(s)->names.contains(s);
        isAvailable.test("Navin");
        isAvailable.test(null);

        Fun1 functionEnglish=(s)->System.out.println("Hello in English"+s);

        functionEnglish.sayHello("Navin");

        Function<String ,String> name=(s)->s+"dynamic";

        System.out.println(name.apply("Navin "));
        System.out.println(name.apply("singh "));
        name=(s)->{
            if(s.startsWith("N")){

            }else{

            }
            return "class"+s;};
        System.out.println(name.apply(" Navin "));
    }

}
