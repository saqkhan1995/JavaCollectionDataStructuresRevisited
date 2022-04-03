package Maps;

import java.util.*;

public class dTreeMapDemo {

    public static void main(String[] args) {

        //makes use of a red-back tree implementation under the hood
        //hence the map is sorted according to the natural ordering of its keys, or by a comparator provided at map creation time, depending on which constructor is used
        Map<Integer, String> map = new TreeMap<>();

        map.put(10, "ten");
        map.put(3, "three");
        map.put(5, "five");
        map.put(1, "one");
        map.put(8, "eight");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("*****************************");

        Map<Integer, String> mapDecending = new TreeMap<>(Comparator.reverseOrder());

        mapDecending.put(10, "ten");
        mapDecending.put(3, "three");
        mapDecending.put(5, "five");
        mapDecending.put(1, "one");
        mapDecending.put(8, "eight");


        for (Map.Entry<Integer, String> entry : mapDecending.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
