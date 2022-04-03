package Sets;

import java.util.HashSet;
import java.util.Set;

public class aHashSetDemo {

    public static void main(String[] args) {

        //Initial Capacity = 16
        //Underlying 1D array under the hood
        //hashCode() function transforms the input into an array index
        //same as map but doesn't use key-value pairs

        //Insertion order not preserved & duplicates not allowed (as compared to LinkedList)
        Set<String> set = new HashSet<>();

        set.add("Adam");
        set.add("Mary");
        set.add("Katy");
        set.add("Ana");

        for (String s : set) {
            System.out.println(s);
        }



    }
}
