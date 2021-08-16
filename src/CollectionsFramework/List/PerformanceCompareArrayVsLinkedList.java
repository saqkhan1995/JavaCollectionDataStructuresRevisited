package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceCompareArrayVsLinkedList {

    public static void main(String[] args) {

        ///ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long now = System.currentTimeMillis();

        for (int i=0; i<50000; i++){
            arrayList.add(0, i); //adding first ->results is a lot of shifting ops, linked list is preferred for this
        }

        System.out.println("Time taken for ArrayList :"+ (System.currentTimeMillis() - now));

        ///ListList
        LinkedList<Integer> linkedList = new LinkedList<>();
        long now2 = System.currentTimeMillis();

        for (int i=0; i<50000; i++) {
            linkedList.addFirst(i); //adding first -> no shifting ops unlike ArrayList & hence faster for intermediate manipulations
        }

        System.out.println("Time taken for LinkedList :"+ (System.currentTimeMillis() - now2));


        //However the addLast for ArrayList & LinkedList performance is more or less the same
        //as there's mnp shifting ops involved in ArrayList when we're adding last (not intermediate or first manipulations)

    }
}
