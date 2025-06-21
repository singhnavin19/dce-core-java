package basic.controlstatement;

import java.util.Scanner;

public class MarksToPercentageToGrad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your physics marks");
        int ph=scanner.nextInt();

        System.out.println("Please enter your chem marks");
        int chem=scanner.nextInt();

        System.out.println("Please enter your bio marks");
        int bio=scanner.nextInt();

        System.out.println("Please enter your Maths marks");
        int math=scanner.nextInt();

        System.out.println("Please enter your Computer marks");
        int comp=scanner.nextInt();

        int totalMarksObtain=ph+chem+bio+math+comp;

        System.out.println("Total marks obtained "+totalMarksObtain +" out of 500");

        float percentage=((float) totalMarksObtain/500)*100;

        System.out.println(percentage);


        //grade calculate kar lena please


    }
}
