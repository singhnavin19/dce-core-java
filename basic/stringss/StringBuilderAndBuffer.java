package basic.stringss;

public class StringBuilderAndBuffer {
    static void main(String[] args) {

        String info=new String("Navin Singh");
        StringBuilder builder=new StringBuilder(info);
        builder.append(" Lokmany chawal ");
        builder.append("Hanuman Nagar");
        builder.append(" kandivali 400101");

        info=builder.toString();
        System.out.println(info);

        String s="navin";
        StringBuilder builder1=new StringBuilder(s);
        builder1.reverse();
        System.out.println(builder1);

        s=s.replace('n','z');
        System.out.println(s.toUpperCase());

        System.out.println(s);
        System.out.println(s.contains("iz"));
        String s1="Navin Singh";
        System.out.println(s1);
        System.out.println(s1.trim());

        s1=s1.substring(1,7);
        System.out.println(s1);

        s1="Navin Singh";
        String s11[]=s1.split(" ");
       for(String s22:s11){
           System.out.println(s22);
       }

    }
}
