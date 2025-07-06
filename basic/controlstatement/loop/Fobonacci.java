package basic.controlstatement.loop;

public class Fobonacci {
    public static void main(String[] args) {
        int no1=0;
        int no2=1;
        int no3=no1+no2;//0+1 ==1
        System.out.print(no1+ " " +no2+" "+no3); //0 1 1
        while(no3<10){ //1>50
            no1=no2;
            no2=no3;
            no3=no1+no2;
            System.out.print(" " +no3);
        }


    }
}
