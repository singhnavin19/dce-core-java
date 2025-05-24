package basic.Stringsss;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class IteerrateOverString {
    public static void main(String[] args) {
        String name="Navin Singh";
        System.out.println("\n1. using Naive");
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
        System.out.println("\n2. using toCharArray");
        for(char c:name.toCharArray()){
            System.out.print(c);
        }
        System.out.println("\n3. using CharacterIterator");
        CharacterIterator iterator=new StringCharacterIterator(name);
        while (iterator.current()!=CharacterIterator.DONE){
            System.out.print(iterator.current());
            iterator.next();
        }

        System.out.println("\n4. using split");
        for(String s:name.split(" ")){
            System.out.println(s);
        }
    }
}
