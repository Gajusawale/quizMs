package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("one",1);
        map.put("two",2);

        System.out.println("map key and values "+map);

        System.out.println("keys "+map.keySet());

        System.out.println("values "+map.values());

        System.out.println("Entries "+ map.entrySet());

        int value=map.remove("two");
        System.out.println("remove "+value);
    }
}
