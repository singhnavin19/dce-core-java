package src.main.com.basic.accessmodifiers;

public class BasePrivate{
    //acess data var = 10
    private int privateI=10; //instance  //nhi
    int defaultI=20; // nhi
    protected int protectedI=30; // nhi
    public int publicI=40;
    public int getI(){
        return privateI;
    }
    protected void printEvenOddNumberprotected(){
        for (int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println("Eeven number "+i);
            }else{
                System.out.println("odd Number "+i);
            }
        }
    }
}
