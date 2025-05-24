package basic.java8.stream;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class BasicStreamOps {
    public static void main(String[] args) {
//        String input=new Scanner(System.in).nextLine();

        List<String> names=List.of("Om","Krishna","rohit","Raaz","Rama","Ravan","Rahul");
//        for(String name:names){
////            if(name.toLowerCase().startsWith(input.toLowerCase())){
////                System.out.println(name);
////            }
//              if(name.substring(0,1).equalsIgnoreCase(input)){
//                  System.out.println(name);
//              }
//        }
        names.stream()
                .filter(name->name.substring(0,1).equalsIgnoreCase("r"))
                .map(r->r.toUpperCase())
                .forEach(x->System.out.println(x));

        System.out.println(Math.copySign(10.45,30.3));

    }
}
