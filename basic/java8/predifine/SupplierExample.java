package basic.java8.predifine;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<String>> students=()->List.of("OmkarG","OmkarP","Rohit","Krishna");
        List<String> s=students.get();
    }
}
