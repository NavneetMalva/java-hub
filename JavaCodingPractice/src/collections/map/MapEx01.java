package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		
		Map<String,Integer> hm = new HashMap<>();
		// add the elements
		hm.put("a", 1000);
		hm.put("b", 2000);
		hm.put("c", 3000);
		hm.put("d", 4000);
		
		System.out.println(hm);
		for(Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.print(e.getKey()+": ");
			System.out.println(e.getValue());
		}
		
		// Change the element value -> also put method
		hm.put("b", 1999);
		System.out.println(hm);
		
		// remove the element
		hm.remove("b");
		System.out.println(hm);
		
		System.out.println("Collection view is: "+ hm.values());
		
		System.out.println(hm.get("c"));

	}

}
