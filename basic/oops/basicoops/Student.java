package basic.oops.basicoops;

public class Student {
    String name;
    int rollNo;
    float percentage;

    public void studentDetails(){
        System.out.println("name="+name);
        System.out.println("rollNo="+rollNo);
        System.out.println("percentage="+percentage);
    }

   public void grade (){
       if(percentage>60){
           System.out.println("A+");
       }else if(percentage>55){
           System.out.println("A");
       }else if(percentage>50){
           System.out.println("B");
       }else if(percentage>40){
           System.out.println("C");
       }else {
           System.out.println("fail");
       }
   }

    public static void main(String[] args) {
        Student vishal=new Student();
        vishal.rollNo=1;
        vishal.name="vishal";
        vishal.percentage=75;
        vishal.grade();
        vishal.studentDetails();


        Student priti=new Student();
        priti.rollNo=2;
        priti.name="priti";
        priti.percentage=77;
        priti.grade();
        priti.studentDetails();


    }

}
