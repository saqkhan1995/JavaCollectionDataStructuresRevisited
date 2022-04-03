package Maps;

import java.util.HashMap;
import java.util.Map;

public class aHashMapDemo {

    public static void main(String[] args) {

        //A standard hashmap makes use of a 1D array under the hood
        Map<Integer, String> map = new HashMap<>();

        //insert into the map O(1) IF THERE IS NO COLLISION
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Lucy");
        map.put(null, "this is a null");

        /*//we can retrieve items based on keys O(1)
        System.out.println(map.get(1));
        //NULL Keys
        System.out.println(map.get(null));*/

        //To get Values using key
        for (Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }

        //To get all key-values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, bHashMapDemoHashCodeAndEquals> map2 = new HashMap<>();
        map2.put("Adam", new bHashMapDemoHashCodeAndEquals("Kevin", 23));
    }
}
