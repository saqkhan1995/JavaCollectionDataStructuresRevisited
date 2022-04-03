package SortingCollections.eSortingWithLanbdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    //With Lambdas, we don't have to use Comparable OR Compartor interfaces

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Adam", 33));
        people.add(new Person("Jow", 12));
        people.add(new Person("Michael", 25));
        people.add(new Person("Ana", 27));
        people.add(new Person("Katy", 78));
        people.add(new Person("Kavin", 45));
        people.add(new Person("Adam", 12));
        people.add(new Person("Adam", 34));

        /*Collections.sort(people); // You need to use Comparable / Comparator interface to use Collections.sort() */

        //Using Lambda
        Collections.sort(people, Comparator.comparing(Person::getName));

        //Using Lambda
        Collections.sort(people, Comparator.comparing(Person::getName).reversed());

        //Using Lambda
        Collections.sort(people, Comparator.comparing(Person::getName).
                thenComparing(Person::getAge).reversed());   // to Sort based on age when the names are same

        for (Person p : people) {
            System.out.println(p.getName() + "-" + p.getAge());
        }
    }
}
