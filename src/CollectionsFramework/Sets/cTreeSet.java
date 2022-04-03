package Sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class cTreeSet {

    public static void main(String[] args) {

        //TreeSet is not Synschorized
        //TreeSet is used to Sort the Set
        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        for (Integer s : set) {
            System.out.println(s);
        }



    }
}
