package basic.controlstatement.loop;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        System.out.println("please enter your table");
        int tableNo=new Scanner(System.in).nextInt();
        System.out.println("table is");
        for(int i=1;i<=10;i++){
            System.out.println(tableNo+"*"+i+" = "+tableNo*i);
        }

    }
}
