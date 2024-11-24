package basic.operators;

public class Fan {
    int blade=3;
    int prize=1200;

    public void rotate(){
        System.out.println("rotate");
        System.out.println("hawa do bhai");
    }

    public static void main(String[] args) {
        Fan f1=new Fan();
        System.out.println(f1.blade);
        System.out.println("prize is "+f1.prize);
        f1.prize=1500;
        System.out.println("prize is "+f1.prize);

        Fan f2=new Fan();
        System.out.println(f2.prize);
        f2.rotate();

    }
}
