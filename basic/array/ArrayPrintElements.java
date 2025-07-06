package basic.array;

import java.util.Scanner;

public class ArrayPrintElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter arrays Size");
        int arraySize= sc.nextInt();

        int array[]=new int[arraySize];

        for (int index=0;index<array.length;index++){
            System.out.println("please enter elements of index "+index);
            array[index]=sc.nextInt();
        }
        for (int index=0;index<array.length;index++){
            System.out.println("array ["+index+"] = "+array[index]);
        }



    }

}
