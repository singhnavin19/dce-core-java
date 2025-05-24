package basic.java8.predifine;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<List> listPrintWithIndex=(list)->{
          for(int i=0;i<list.size();i++){
              System.out.println("index is"+i+ " = "+ list.get(i));
          }
        };
        listPrintWithIndex.accept(List.of(1,2,3,4,5));
    }
}
