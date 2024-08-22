package collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapEx02CountOccurance {
	public static void main(String[] args) {
		
		int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : a)
			list.add(i);
		System.out.println(list);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++) {
			hm.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		System.out.println("Frequency of each elements is : "+hm);
		
		
	}

}
