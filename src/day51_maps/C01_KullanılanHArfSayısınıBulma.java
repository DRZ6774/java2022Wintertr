package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanılanHArfSayısınıBulma {
    /* Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
   	Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
*/
    public static void main(String[] args) {

        String input="Helllloooooo";
        String harflerArr[]=input.split("");
        Map<String,Integer> kullanımSayıları=new HashMap<>();

        for (String each:harflerArr
             ) {
            if (kullanımSayıları.containsKey(each)){
                kullanımSayıları.put(each,kullanımSayıları.get(each)+1);
            }else {
                kullanımSayıları.put(each,1);
            }
        }
        System.out.println(kullanımSayıları);  //{e=1, H=1, l=4, o=6}
    }
}
