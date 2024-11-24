package basic.array;

public class ProblemStatement5 {
    public static void main(String[] args) {//gate
        int val5=5;
        for(int row=1;row<=5;row++){
            //3
            for(int space=0;space<val5-row;space++){
                System.out.print(" ");
            }
            int maxCol=row*2-1; //5
            for (int col=1;col<=maxCol;col++){ //
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
