package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma_Calısma {

    public static void main(String[] args) {
        Map<Integer,String > sınıf=MapOlustur.myMap();
        System.out.println(sınıf);
        //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}
        sınıfListYazdır(sınıf);






    }

    public static void sınıfListYazdır(Map<Integer, String> sınıf) {

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        Set<Integer>keySet= sınıf.keySet();
        Collection<String> valueSet= sınıf.values();

        System.out.println(keySet); //[101, 102, 103]

        System.out.println(valueSet);//[101, 102, 103]
        //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
    }
}
