package SortingCollections.dComparatorInterface;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getNumOfPages(), book2.getNumOfPages());
    }
}
