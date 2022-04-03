package Maps;

import java.util.HashMap;
import java.util.Map;

public class bHashMapDemoHashCodeAndEquals {

    private String name;
    private int age;

    public bHashMapDemoHashCodeAndEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "bHashMapDemoHashCodeAndEquals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Determines whether two objects are the same or not
    //because
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        bHashMapDemoHashCodeAndEquals that = (bHashMapDemoHashCodeAndEquals) o;

        if (age != that.age) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    //Essentially a Hash Function i.e. Hash Code = Hash function
    //It calculates an array index (bucket) based on the key (keys == this class object)
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //THERE ARE SOME RULES FOR HASHCODE() AND EQUALS()
    // 1) if two objects are equal then they must have the same hash code
    // 2) if two objects have the same hashcode, they may or may not be equal
}
