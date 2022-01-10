package Queues.model;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + '\'' +
                "name='" + this.name + '\'' +
                ", age=" + this.age ;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.getAge());  //prioritizing According to the age
        //for prioritizing according to name -> this.name.compareTo(otherPerson.getName());
        //Reverse the order with a negative "-" sign -> -this.name.compareTo(otherPerson.getName());
    }
}
