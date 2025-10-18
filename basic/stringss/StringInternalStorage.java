package basic.stringss;

public class StringInternalStorage {
    static void main(String[] args) {
        String s="Hello";

        System.out.println(s.length());
        int i=s.length()-1;
        for(;i>=0;i--){ //i=-1
            System.out.print(s.charAt(i)); //o l l e h
        }


        for(char c1:s.toCharArray()){
            System.out.println(c1);
        }



//        char c[]={'1','2','~'};
//
//        for(char i2:c){
//            System.out.println(i2);
//        }

    }
}
