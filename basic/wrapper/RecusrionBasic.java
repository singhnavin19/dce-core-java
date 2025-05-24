package basic.wrapper;

public class RecusrionBasic {
    static  int count=0;
    public static void main(String[] args) {
        count++;
        System.out.println("hello main");
       if(count<10){
           main(new String[]{"sd","dsd"});
       }
    }
}
