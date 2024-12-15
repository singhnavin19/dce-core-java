package basic.oops.inheritance;

public class Dog extends Animal{
    public void barking(){
        System.out.println("bhow bhow");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println(d.legs);
       d.sound();
    }
}
