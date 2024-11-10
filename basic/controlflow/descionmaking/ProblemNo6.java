package basic.controlflow.descionmaking;

public class ProblemNo6 {
    public static void main(String[] args) {
        int physic=98;
        int chem=87;
        int bio=89;
        int maths=97;
        int computer=98;

        int totalObrained=physic+chem+bio+maths+computer;


        float percent=(float)totalObrained/500;
        percent=percent*100;

        System.out.println(percent);
        if(percent>=90){
            System.out.println("Grade A");
        }else if(percent>=80){
            System.out.println("Grade B");
        }else if(percent>=70){
            System.out.println("Grade C");
        }

    }
}
