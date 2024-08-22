package collections.linkedlist;

//Java Program to Demonstrate
//Implementation of LinkedList class

//Importing required classes
import java.util.*;

//Main class
public class LinkedListEx01 {

	// Driver code
	public static void main(String args[]) {
		// Creating object of the
		// class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		// Using the Get method and the for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// Using the for each loop
		for (int i : list)
			System.out.print(i + " ");

		System.out.println();
		System.out.println("list: " + list);

		// Linked list to To Array by using toArray();
		Object[] arr = list.toArray();
		for (Object obj : list) {
			System.out.print(obj + " ");
		}

		list.addFirst(1); // Add at the very first
		list.addLast(100); // add at the very end
		list.add(1, 2); // add at specific position
		list.set(2, 3); // replace at the specific position
		System.out.println("list: " + list);
		
		// Iterate the linkedList in reverse order
		System.out.println("Elements in Reverse Order:");
		for(int i=list.size()-1;i>=0;i--)
			System.out.print(list.get(i)+" ");
		
		System.out.println();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}
}
