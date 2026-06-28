package basic.loop.jumpOrBranch;

public class BreakAndContinue {
    static void main(String[] args) {
        int tableNo=Integer.valueOf(IO.readln("staring table chaiye"));
        int kahaTak=Integer.valueOf(IO.readln("kaha tak chaiye"));

        for(int i=tableNo;i<=kahaTak;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j+" ");
                break;
            }
            System.out.println();
        }


    }
}
