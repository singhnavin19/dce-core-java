package basic.oops.polymorphism;

public class BasicOverloading {
    BasicOverloading(){}
    BasicOverloading(int i){}
    BasicOverloading(char c){};

    void add(int i,int j){
        System.out.println("addition is "+(i+j));
    }
    void add(int i,int j,int k){
        System.out.println("addition is "+(i+j+k));
    }

    public static void main(String[] args) {
        BasicOverloading basicOverloading=new BasicOverloading();
        basicOverloading.add(10,10,20);
    }
}
