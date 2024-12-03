package collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListEx03 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		System.out.println("ArrayList: "+list);
		
		Set<Integer> hs = new HashSet<>();
				
		for(int element:list) {
			hs.add(element);
		}
		System.out.println("hashSet: "+hs);
//		ArrayList: [1, 5, 2, 3, 1, 2]
//		hashSet: [1, 2, 3, 5]

		// List.of created an immutable object
		List<String> ls = List.of("Java","Python","C++");
		ls.add("SpringBoot"); // EXCEPTION in thread "main" java.lang.UnsupportedOperationException

		Set<String> ss = Set.of("Java","Springboot");
		ss.add("React"); // EXCEPTION in thread "main" java.lang.UnsupportedOperationException


		
		
	}

}
