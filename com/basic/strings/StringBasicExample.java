package com.basic.strings;

import javax.management.ObjectName;

class OmkarP{
    public int no;

    @Override
    public boolean equals(Object obj){
        OmkarP p= (OmkarP) obj;
        return  p.no==this.no;
  }
    public OmkarP(int i) {
        this.no = i;
    }
}
public class StringBasicExample {
    public static void main(String[] args) {
        OmkarP o1=new OmkarP(10);
        OmkarP o2=new OmkarP(20);

        String s="Hello";
        s=s.concat("Hi How are you ");
        System.out.println(s);
//        System.out.println(o2.hashCode()+" "+o1.hashCode());
//        System.out.println(o1==o2);
//        System.out.println(o1.equals(o2));
//

//         String s="Navin";
//        String s1=new String("Navin");
//        System.out.println(s.length());
//        System.out.println(s1.length());
//
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//
//        System.out.println(s1.equals(s));
//        System.out.println(s==s1);

    }
}
