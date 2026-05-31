package basic.conditional;

public class PassFailExampleWithGrade {
    static void main(String[] args) {
        int subjectMarks = 60;
        int m=169,p=155,bh=160;
        if(m>p&&m>bh){
            System.out.println("Mohit is taller than P and BH");
        }else if(p>m&&p>bh){

        }else if(bh>p&&bh>m){

        }

        if (subjectMarks >= 40) {
            if (subjectMarks > 90) {
                IO.println("A+");
            } else if (subjectMarks > 80) {
                IO.println("A");
            }
        } else {
            System.out.println("Sorry !!! failed");
        }
    }
}
