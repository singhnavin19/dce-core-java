package basic.controlflow.descionmaking;

public class IFElseLadder {
    public static void main(String[] args) {
        int productCount=2;
        if(productCount>=3){
            System.out.println("discount percentage is 40%");
        }
        else if(productCount>=2){
            System.out.println("discount percentage is 30%");
        }
        else if (productCount>=1){
            System.out.println("discount percentage is 20 %");
        }
    }
}
