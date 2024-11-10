package basic.controlflow.descionmaking;

public class MultipleIf {
    public static void main(String[] args) {
        //1000 growels
        // 2000 oberoi
        // 5000 nesco
        int amount=10000;
        if(amount>=5000){
            System.out.println("nesco jana hai");
        }else if(amount>=2000){
            System.out.println("oberoi mall jana");
        }else if(amount>=1000){
            System.out.println("growels jana hai");
        }else{
            System.out.println("ghar baitho");
        }
        System.out.println("thanks");

    }
}
