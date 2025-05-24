package basic.Stringsss;

public class ImmutableExample {
    public static void main(String[] args) {
        String s=new String("navin");//SCP
        String s1="navin";// ==
        System.out.println("s "+s.hashCode()+" s1 "+s1.hashCode());
        System.out.println(s==s1);
        s=s.intern();
        System.out.println(s==s1);
    }
}
