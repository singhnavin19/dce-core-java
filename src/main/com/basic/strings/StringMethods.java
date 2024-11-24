package src.main.com.basic.strings;

import java.nio.charset.StandardCharsets;

public class StringMethods {
    public static void main(String[] args) {
        String name="dynamic";
//        System.out.println(name.charAt(3));

        String vehicleNo="MH-47-AK-5157";
        System.out.println(vehicleNo.substring(0,2));
        System.out.println(vehicleNo.substring(3,5));
        int start=vehicleNo.length()-4;
        System.out.println(vehicleNo.substring(start));

        System.out.println(vehicleNo.contains("MH"));
        System.out.println(vehicleNo.getBytes(StandardCharsets.ISO_8859_1));


        System.out.println(" Navin Singh ".trim());

        System.out.println(vehicleNo.startsWith("MH"));

    }


}
