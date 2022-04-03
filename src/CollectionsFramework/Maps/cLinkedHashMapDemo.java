package Maps;

import Maps.bHashMapDemoHashCodeAndEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class cLinkedHashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // With Typical Hashmaps, insertion order is not preserved
        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put("eee", 5);
        map.put("fff", 6);
        map.put("ggg", 7);
        map.put("hhh", 8);
        map.put("iii", 9);
        map.put("jjj", 10);

        for (String key: map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        //So if we use a "LinkedHashMap" instead, it preserves the insertion order ************ (does not sort it though, for that use treemaps)
        // basically the main & only advantage of LinkedHasMaps over standard HashMaps *************
        //(There is a double Linked List connecting the inserted items, hence needs more memory)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // With Typical Hashmaps, insertion order is not preserved
        linkedHashMap.put("aaa", 1);
        linkedHashMap.put("bbb", 2);
        linkedHashMap.put("ccc", 3);
        linkedHashMap.put("ddd", 4);
        linkedHashMap.put("eee", 5);
        linkedHashMap.put("fff", 6);
        linkedHashMap.put("ggg", 7);
        linkedHashMap.put("hhh", 8);
        linkedHashMap.put("iii", 9);
        linkedHashMap.put("jjj", 10);

        for (String key: linkedHashMap.keySet()) {
            System.out.println(key + " - " + linkedHashMap.get(key));
        }


    }
}
