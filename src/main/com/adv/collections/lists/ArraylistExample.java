package src.main.com.adv.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        System.out.println(list);
        list.add(20);
        list.add(40);
        System.out.println(list);

        System.out.println(list.contains(60));

        list.add(1,100);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        List<String> students=List.of("Omkar Ji","Omkar P","Krishna","Rohit","Omkar Ji");
        for(int index=0;index<students.size();index++){
            System.out.println("index="+ index+" elements ="+students.get(index));
        }
        System.out.println(students.get(2));
        students.add("navin");


    }
}
