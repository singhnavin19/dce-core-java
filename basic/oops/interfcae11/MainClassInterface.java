package basic.oops.interfcae11;

public class MainClassInterface {
    static void main(String[] args) {
        HelloInterface helloInterface = new HelloInHindi();
//         helloInterface.i=20;
        System.out.println(helloInterface.i);
        helloInterface.hello();
        helloInterface = new HelloInEnglish();
        helloInterface.hello();
    }
}
