package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet_Calısma {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=MapOlustur.myMap();

        System.out.println(sinifListMap);
        //{101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, C#, 2000, 104=Ayse, Kan, C#, 2001, 105=Fatma, Han, Java, 2002}

        System.out.println(sinifListMap.entrySet());
        //[101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, C#, 2000, 104=Ayse, Kan, C#, 2001, 105=Fatma, Han, Java, 2002]

        Set<Map.Entry<Integer,String>> sinifEntrySeti=sinifListMap.entrySet();
        System.out.println("No   Isim    Soyisim   Brans  D.Yili");

        for (Map.Entry<Integer,String>each:sinifEntrySeti
             ) {
            Integer entryKey=each.getKey();
            String valueStr=each.getValue();

            String valueArr[]=valueStr.split(",");

            System.out.printf( "%-4d %-6s %-9s %-6s %s\n" , entryKey, valueArr[0], valueArr[1]
                    , valueArr[2], valueArr[3]);
            System.out.println("----------------------------------");
        }

    }
}
