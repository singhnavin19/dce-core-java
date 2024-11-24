package src.main.com.basic;

import java.util.*;

public class Map2MapCompare {
    public static void main(String[] args) {
        List<Map<String ,String>> map1=List.of(Map.of("a","1","A","1","A1","11"),Map.of("A1","1"));
        Map<String,String> map2=Map.of("A","1");

        for (Map<String,String> m:map1){
                for(String key:m.keySet()){


            }
//                System.out.println(m.keySet().equals(map2.keySet()));
        }


    }
}
