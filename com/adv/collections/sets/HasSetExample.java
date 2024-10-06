package com.adv.collections.sets;

import java.sql.Array;
import java.util.*;

public class HasSetExample {
    public static void main(String[] args) {
        Set<String> names=new LinkedHashSet<>();
        names.add("navin");
        names.add("NAvin");
        names.add(null);
        System.out.println(names);
        System.out.println(names.contains("Navin"));
    }
}
