package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream_Calısma {
    public static void main(String[] args) {

        String dosyayolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
            int k=0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
