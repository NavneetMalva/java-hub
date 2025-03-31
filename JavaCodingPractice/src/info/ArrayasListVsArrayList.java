package info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Arrays.asList:
It creates a fixed-size list backed by an array.
The list returned is not a regular java.util.ArrayList; it’s a wrapper around the original array.
You can modify the elements within the list, but you cannot add or remove elements because it’s a fixed-size view.

ArrayList:
It’s a resizable array implementation of the List interface.
It allows dynamic resizing, meaning you can add, remove, and modify elements.
It’s part of the java.util.ArrayList class.
*/

public class ArrayasListVsArrayList {

  public static void main(String[] args) {
    // Arrays.asList()
    List<String> arrList = Arrays.asList("Apple", "Banana", "Orange");

    // Modifying elements is allowed
    arrList.set(1, "Grapes");
    System.out.println("After modifying: " + arrList);

    // Adding or removing elements is not allowed (throws UnsupportedOperationException)
    //arrList.add("Watermelon"); // Throws UnsupportedOperationException

    // ArrayList
    List<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    // Modifying elements
    list.set(1, "Grapes");
    System.out.println("After modifying: " + list);

    // Adding and removing elements is allowed
    list.add("Watermelon");
    System.out.println("After adding: " + list);

    list.remove("Apple");
    System.out.println("After removing: " + list);

  }
}
