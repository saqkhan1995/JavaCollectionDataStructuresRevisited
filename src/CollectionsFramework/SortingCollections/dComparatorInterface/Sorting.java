package SortingCollections.dComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus", "title1", 223));
        books.add(new Book("Heidegger", "Being and time", 891));
        books.add(new Book("Michio Kaku", "Quantum Physics", 34));

        //Ascending
        Collections.sort(books, new BookComparator());

        System.out.println(books);

        //Descending
        Collections.sort(books, new BookComparator().reversed());

        System.out.println(books);
    }
}
