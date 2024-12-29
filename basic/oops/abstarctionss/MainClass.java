package basic.oops.abstarctionss;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Test t=getObject();
        t.sayHello();
        System.out.println(t.i);
    }

    public static Test getObject() {
        Test t=null;
        System.out.println("1.for Hindi  2.English  3.Gujrati");
        int i=new Scanner(System.in).nextInt();
        if(i ==1){
            t =new HindiLanguage();
        }else if(i ==2){
            t =new EnglishLang();
        }else if(i ==3){
            t =new GujratiPerson();
        }else if(i==4){

        }
        return t;
    }
}
