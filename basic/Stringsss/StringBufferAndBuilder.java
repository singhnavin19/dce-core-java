package basic.Stringsss;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        String s=new String("Kirti");//normal
        String s1="Kreeti";//literals // one only String

        StringBuilder b=new StringBuilder(s);
        System.out.println(b.reverse());

        StringBuffer buffer=new StringBuffer(s);
        System.out.println(buffer.reverse());



    }
}
