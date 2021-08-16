package CollectionsFramework.List;

public class VectorDemo {

    //Vectors are synchronized

    //The iterators returned by Vector class's Iterator & ListIterator methods are "fail-fast"
    //If the vector is structurally modified at any point after the iterator is created (except through add/remove),
    // the iterator would then throw a "ConcurrentModificationException" .
    //Thus the iterator fails quickly & cleanly -> fail-fast


    //Vectors also also have methods to determine "capacity increment" factor when the initial capacity is exceeded
    //unlike arrayList/LinkedList where the capacity is usually almost doubled whenever the initial capacity is exceeded
}
