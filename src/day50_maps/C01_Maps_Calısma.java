package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps_Calısma {
    public static void main(String[] args) {

        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer,String> sınıfListMap=MapOlustur.myMap();
        System.out.println(sınıfListMap);
        //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        Set<Integer> sınıfKeySeti=sınıfListMap.keySet();
        List<Integer> keyList=new ArrayList<>();
        keyList.addAll(sınıfKeySeti);

        Collection<String > sınıfValueColl=sınıfListMap.values();
        System.out.println(sınıfValueColl);
        //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        List<String >sınıfValueList=new ArrayList<>();
        sınıfValueList.addAll(sınıfValueColl);

        System.out.println(sınıfValueList);
        //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        int outerArrayBoyut=sınıfValueList.size();
        System.out.println(outerArrayBoyut);  //3

        String ilkValue=sınıfValueList.get(0);
        System.out.println(ilkValue); //Ali, Can, Dev

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;
        System.out.println(innerArrayBoyut); //3

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sınıfValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];

            }

        }

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i <keyList.size(); i++) {
            System.out.print(keyList.get(i)+" ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+" ");

            }
            System.out.println("");
        }
    }
}
