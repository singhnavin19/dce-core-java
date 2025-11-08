package basic.stringss;

public class StringMrmory {
    static void main(String[] args) {
        String s=new String("navin");// 2 objects 1-heap 1- SCP(String Constant Pool)
        String s1="navin";//SCP already
        String s2=new String("navin");
        String s3="navin";
        String s4="Navin";
        String s5=new String("Navin");



    }
}
