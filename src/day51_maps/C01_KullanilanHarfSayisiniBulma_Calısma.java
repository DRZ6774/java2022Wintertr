package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma_Calısma {
    public static void main(String[] args) {
         /*
    Soru 1 ) Verilen bir String’deki harfleri
    ve harflerin kacar kez kullanildigini return eden bir method yaziniz
   	Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
     */
    String input="Hellooo";
    String harflerArr[]=input.split("");

    Map<String,Integer> kullanımSayileri = new HashMap<>();

        for (String each:harflerArr
             ) {
            if (kullanımSayileri.containsKey(each)){
                kullanımSayileri.put(each,kullanımSayileri.get(each)+1);

            }else {
                kullanımSayileri.put(each,1);
            }
        }

        System.out.println(kullanımSayileri);  //{e=1, H=1, l=2, o=3}













    }
}
