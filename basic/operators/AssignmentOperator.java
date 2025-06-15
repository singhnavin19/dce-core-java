package basic.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x=10;
        x +=x; //x=x+10  //x=10+10
        System.out.println(x);

        x/=2;  // x=x/2
        System.out.println(x);
        int y=2;

        x+=y;  //x=x+y  10+2 12
        System.out.println(x);


    }
}
