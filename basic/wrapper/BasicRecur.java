package basic.wrapper;

public class BasicRecur {
    public static void main(String[] args) {
        int no=1;
        if (no<5){
            printNo(no++);
            System.out.println(no);
        }
    }

    static void printNo(int no){
        System.out.println(no);
    }
}
