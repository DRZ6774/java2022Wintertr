package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_FileInputStream_Calısma {
    public static void main(String[] args)  {

        String dosyaYolu = "src/day40_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
