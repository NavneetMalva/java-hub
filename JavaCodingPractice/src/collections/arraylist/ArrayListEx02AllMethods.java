package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx02AllMethods {

	public static void main(String[] args) {

		// 1.Add the elements in a list
		List<String> list = new ArrayList<>();
		list.add("Blue");
		list.add("Green");
		list.add("Ocean");

		System.out.println(list); // [Blue, Green, Ocean]

		// 2. Iterate all the values from the list
		for (String i : list) {
			System.out.print(i + " "); // Blue Green Ocean
		}

		// 3. Add the element at the position
		list.add(0, "Pink");
		list.add(2, "Ocean Green");
		System.out.println(list); // [Pink, Blue, Ocean Green, Green, Ocean]

		// 4. retrieve an element (at a specified index)
		System.out.println(list.get(3)); // Green

		// 5. Update the element at a position
		list.set(2, "Ocean");
		System.out.println(list); // [Pink, Blue, Ocean, Green, Ocean]

		// 6. remove the third element from an array list.
		list.remove(2);
		System.out.println(list);

		// 7. search for an element in an array list.
		String color = "Green";
		if (list.contains(color)) {
			System.out.println("Found the element at index: " + list.indexOf(color));
		} else {
			System.out.println("Not in the list");
		}

		// 8. sort the ArrayList
		Collections.sort(list);
		System.out.println("sorted list: " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sorted list: " + list);

		// 9. Copy from one list to another
		// Collections.copy(dest, src);
		List<String> list2 = new ArrayList<>();
		/*
		 * Collections.copy(list2, list); It will throw the exception that
		 * "Source does not fit in dest" because we have not defined the size of list2 ,
		 * which is empty currently.
		 */

		// List<String> list3 = List.of("A","B","C","D");
		// Collections.copy(list3, list);
		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		list3.add("D");
		Collections.copy(list3, list);
		System.out.println("list3 after copied: " + list3);

		// 10. shuffle elements in an array list.
		Collections.shuffle(list);
		System.out.println("shuffled list: " + list);

		// 11. reverse elements in an array list.
		Collections.reverse(list);
		System.out.println("reversed list: " + list);

		// 12 . Extract a portion of the list
		List<String> subList = list.subList(0, 3);
		System.out.println("subList: " + subList); // [Green, Ocean, Pink] index 3 is excluded.

		list.add("white");
		list.add("Red");

		// 13. compare two array lists.
		System.out.println("list: " + list); // [Pink, Blue, Ocean, Green, white, Red]
		System.out.println("list3: " + list3); // [Pink, Ocean, Green, Blue]

		List<String> list4 = new ArrayList<>();

		for (String e : list) {
			list4.add(list3.contains(e) ? "yes" : "No");
		}
		System.out.println("list4: " + list4);

		// 14. swaps two elements in an array list.
		Collections.swap(list, 1, 0);
		System.out.println("list after swapping the elements: " + list);

		// 15. join two array lists.
		System.out.println("list2 before joining: " + list2);
		list2.addAll(list4);
		System.out.println("list2 after joining: " + list2);

		// 16. clone the arrayList
		ArrayList<String> clonedList = new ArrayList<String>();
		clonedList = (ArrayList) ((ArrayList) list).clone();
		System.out.println("clonedList: " + clonedList);

		// 17. to empty an array list.
		list2.removeAll(list2);
		System.out.println("list2 emptied: " + list2);

		// 18. test whether an array list is empty or not.
		System.out.println(list2.isEmpty());
		System.out.println(list.isEmpty());

		// 19. trimming the capacity of an array list.
		// ((ArrayList<String>) list4).trimToSize();

		// 20. Increase the size of the list
		((ArrayList<String>) list4).ensureCapacity(10);

		/*
		 * To avoid the type casting like this ((ArrayList<String>)list4), defined the
		 * list as ArrayList type
		 */

		ArrayList<String> l1 = new ArrayList<String>(2);
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		l1.add("Four");
		System.out.println("l1: " + l1); // l1: [One, Two, Three, Four]
		l1.ensureCapacity(6);
		l1.add("Five");
		System.out.println("l1: " + l1); // [One, Two, Three, Four, Five]

		List<Integer> dummyList = new ArrayList<>();
		dummyList.add(1);
		dummyList.add(null);
		dummyList.add(2);
		System.out.println("dummyList: "+dummyList);
		
		// Traversing elements using Iterator
		Iterator<Integer> itr= dummyList.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}

}
