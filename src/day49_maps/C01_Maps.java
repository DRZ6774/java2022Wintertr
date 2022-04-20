package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        List<Object>list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);  //[Ergin, 15, 10.2]
        list.set(1,(Integer)(list.get(1))+10);
        System.out.println(list);//[Ergin, 25, 10.2]

        Map<Integer,String > sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");
        System.out.println(sinifList); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        System.out.println(sinifList.keySet()); //[101, 102, 103]

        System.out.println(sinifList.values()); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]


    }
}
