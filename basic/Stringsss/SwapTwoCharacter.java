package basic.Stringsss;

public class SwapTwoCharacter {
    public static void main(String[] args) {
        System.out.println("1st way");
        String name="navin";
        char []c =name.toCharArray();
        char temp=c[name.length()-2];
        c[name.length()-2]=c[name.length()-1];
        c[name.length()-1]=temp;

        System.out.println(new String(c));

        char bcp=name.charAt(name.length()-1);
        name=new StringBuilder(name).reverse().toString();
        name=name.replace(name.charAt(name.length()-1),name.charAt(name.length()-2));
        System.out.println(name);
    }
}
