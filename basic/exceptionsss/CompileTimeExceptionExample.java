package basic.exceptionsss;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeExceptionExample {
    static void main(String[] args) throws Exception{
//        compileTimeExceptionWithTryCath();
        BufferedInputStream f=new BufferedInputStream(new FileInputStream("sdsd"));
        System.out.println("hello");
    }

    private static void compileTimeExceptionWithTryCath() {
        BufferedInputStream file = null;
        try {
            file = new BufferedInputStream(new FileInputStream("basic/abc11.txt"));
        } catch (Exception ec) {
            System.out.println("file not found");
        } finally {
            try {
                if (file != null) {
                    file.close();
                    System.out.println("close file connection");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
