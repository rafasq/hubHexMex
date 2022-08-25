package demo.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
//        List<String> // only strings
        List<String> list1 = new LinkedList<>();
//        list1.add(50);
        list1.add("Linked");
        list1.add("List");
        list1.add("Linked");
        list1.add("Map");
        list1.add("Collection");
        List<String> list2 = new LinkedList<>();
        list2.add("Linked");
//        Removes from this list all of its elements that are contained in the specified collection
        list1.removeAll(list2);
        for (String temp : list1)
            System.out.printf(temp + " ");
        System.out.println();
    }
}
