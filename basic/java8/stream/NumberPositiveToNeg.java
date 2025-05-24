package basic.java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberPositiveToNeg {
    public static void main(String[] args) {
        Stream<Integer> numbers= Stream.of(100,1,2,3,3,-10,2,-20,50);
//        numbers.map(no->Math.abs(no))
//                .forEach(n->System.out.println(n));
//
        Set<Integer> positiveNuber= numbers.filter(n->n>0).
                collect(Collectors.toSet());

        System.out.println(positiveNuber);
    }
}
