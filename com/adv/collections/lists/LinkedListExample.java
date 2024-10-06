package com.adv.collections.lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter no of elements you want to enter");
        int noOfElements=scanner.nextInt();

        for(int i=0;i<noOfElements;i++){
            System.out.println("please enter elements");
            linkedList.add(scanner.nextInt());
        }
        System.out.println(linkedList);
    }
}
