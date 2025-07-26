package basic.oops.construct;

import java.util.Scanner;

public class BasicConstruct {
    public BasicConstruct(){ //No args constructor or without parameter constructor
        System.out.println("No Args constructor");
    }
    public BasicConstruct(int no){
        System.out.println("args constructor= "+no);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BasicConstruct basicConstruct=new BasicConstruct();
        BasicConstruct basicConstruct1=new BasicConstruct(1950);

    }
}
