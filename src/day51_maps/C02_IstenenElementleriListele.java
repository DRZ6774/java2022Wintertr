package day51_maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C02_IstenenElementleriListele {
    /*Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
 mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 Istenen dil è java
 Sonuc è [Ali, Veli]*/

    public static void main(String[] args) {
        Map<Integer,String > sınıfMap=MapOlustur.myMap();
        String istenenDil="Java";
        List<String >istenenDiliBilenler=istenenDiliBilenlerListesiOlustur(sınıfMap,istenenDil);


    }

    public static List<String> istenenDiliBilenlerListesiOlustur(Map<Integer, String> sınıfMap, String istenenDil) {

   List<String>istenenDiliBilenlerListesi=new ArrayList<>();
   Collection<String> sinifValueColl =sınıfMap.values();
   List<String> sinifValueList=new ArrayList<>();
   sinifValueList.addAll(sinifValueColl);
        int outerArrayBoyut= sinifValueList.size();
        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;
        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j] = temp[j];
            }
        }

        for (int i = 0; i <outerArrayBoyut; i++) {

            if (valueMDArr[i][2].equals(istenenDil)){

            }

        }
        return istenenDiliBilenlerListesi;
    }
}
