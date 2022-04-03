package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class aLinkedHashSetDemo {

    public static void main(String[] args) {

        //Use LinkedHashSet to preserve insertion order
        //Uses doubly Linked List connecting the items
        //It needs more memory than standard HashSets (as it uses doubly Linked Lists)
        Set<String> set = new LinkedHashSet<>();

        set.add("Adam");
        set.add("Kevin");
        set.add("Daniel");
        set.add("Joe");
        set.add("Ana");

        for (String s : set) {
            System.out.println(s);
        }



    }
}
