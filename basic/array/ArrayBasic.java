package basic.array;

public class ArrayBasic {
    public static void main(String[] args) {
        int x=10;
        int x1[]={10,20,30,40}; //

        for(int roomNo=0;roomNo<x1.length;roomNo++){ //roomNo=2
            System.out.println(x1[roomNo]); //0-10 1-20 2-30 3-40 4
        }

        int x2[]=new int[10];
        x2[0]=78;
        x2[3]=98;
        System.out.println(x2[1]);




//other ways to define array
//        int []x2;
//        int[] x3;
//        []int x4;

    }
}
