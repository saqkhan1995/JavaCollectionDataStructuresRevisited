package CollectionsFramework.List;

import java.util.Stack;

//Stacks are synchronized too
public class StacksDemo {

    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        //names.add("Dwight"); this should work fine but we usually use push/pop methods

        names.push("Dwight");
        names.push("Jim");
        names.push("Ryan");
        names.push("Pam");

        System.out.println(names.pop()); //pop() will return & remove the item from the stack
        //peek() will only retun the item & NOT remove it from the stack

    }
}
