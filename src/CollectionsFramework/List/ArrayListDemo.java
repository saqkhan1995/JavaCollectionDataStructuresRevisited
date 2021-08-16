package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Resizing the array takes O(N) when initial capacity is exceeded
        List<String> names = new ArrayList<>(20); // initialCapacity = 20

        names.add("Dwight");
        names.add("Jim");
        names.add("Michael");



        //inserting/Removing item into a particular index loc - O(N)
        //subsequent items are shifted to next loc
        names.add(0, "temp");
        names.remove(0);

        //ArrayLists are fast if we manipulate the last item (No shifting process in this case)

        //random indexing is O(1) -> main adv of using arraylist
        System.out.println(names.get(0));

        //contains() will check of the item is present in the array
        System.out.println(names.contains("Jim"));

        //Because of the Iterable interface, we can make use of "for-each" loop
        for (String s: names) {
            System.out.println(s);
        }


        //Using Arrays.asList() to initiaze
        List<String> names2 = Arrays.asList("name1","name2","name3");

    }
}
