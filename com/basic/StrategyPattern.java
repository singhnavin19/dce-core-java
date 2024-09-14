package com.basic;

import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {


    public static void main(String[] args) {
        List<Integer> nos=List.of(1,2,3,44,5,6,7,10,23);
        List<String> names=List.of("A","B","C","D","E","F");
        addLetter(names,name->!name.equals("A"));
//        addNumber(nos,n->n>0);
    }

    private static void addLetter(List<String> names,Predicate<String> test) {
        StringBuilder result=new StringBuilder();
        for(String s:names){
            if(test.test(s)){
                result.append(s);
            }
        }
        System.out.println(result);
    }

    private static void addNumber(List<Integer> nos,Predicate<Integer> selector) {
        int result=0;
        for(int no:nos){
            if(selector.test(no)){
                result=result+no;
            }
        }
        System.out.println(result);
    }
}
