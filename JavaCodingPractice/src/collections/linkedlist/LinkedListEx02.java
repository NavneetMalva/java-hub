package collections.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx02 {
  public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3, 4, 5};

    List<Integer> arrList = Arrays.asList(numbers);
    System.out.println("arrList: " + arrList);

    Object[] array = arrList.toArray();
    System.out.println("array:" + Arrays.toString(array));

    /**
     * Insert an element at the head and tail of a LinkedList
     * head -> addFirst, offerFirst
     * tail-> add() or addLast() or offer() or offerLast() t
     */
    LinkedList<Integer> list = new LinkedList<>();

    list.add(10);
    list.addLast(20);
    list.offer(30);
    list.offerLast(40);
    System.out.println(list);
    list.addFirst(9);
    list.offerFirst(8);
    System.out.println("after adding elements at head :" + list); // [8, 9, 10, 20, 30, 40]

    //Removing the elements from the queue
    System.out.println(list.poll());    //Output : 8
    System.out.println(list.poll());    //Output : 9

    List<Integer> list1 = new LinkedList<>(List.of(99, 199, 299));
    //Adding all elements of list1 at index 3 of list
    list.addAll(3, list1);
    System.out.println(list);

    /**
     * remove elements from
     * head -> poll , pollFirst, remove, removeFirst
     * tail -> pollLast, removeLastI
     */

    /**
     * Remove the first occurrence  -> list.removeFirstOccurrence
     * Remove the last occurrence -> list.removeLastOccurrence
     */

    /*
     * LinkedList has pop() and push() methods which make LinkedList to function as a Stack.
     */
    LinkedList<Integer> listStack = new LinkedList<>();
    listStack.push(10);
    listStack.push(20);
    listStack.push(30);
    listStack.pop();
    System.out.println("listStack :" + listStack);

    list.add(30);
    // Using lastIndexOf() method,
    // we can retrieve the position of last occurrence of a given element in a LinkedList.
    System.out.println(list.lastIndexOf(30));

  }
}
