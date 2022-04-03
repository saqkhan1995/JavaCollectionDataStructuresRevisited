package SortingCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bSortingCollections {

    public static void main(String[] args) {

        List<String> list =  Arrays.asList("Adam", "Joe", "Katy", "Ana");

        Collections.sort(list);
        System.out.println(list);

        //We can reverse the order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
