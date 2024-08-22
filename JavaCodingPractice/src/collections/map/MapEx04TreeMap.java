package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx04TreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		// Put elements to the map
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(30, "Black");
		tree_map.put(40, "White");
		tree_map.put(50, "Blue");

		for (Integer key : tree_map.keySet()) {
			System.out.println(key + ":" + tree_map.get(key));
		}

		TreeMap<Integer, String> tree_map2 = new TreeMap<>();
		tree_map2.put(50, "Orange");
		tree_map2.put(60, "Pink");

		// Copying all elements from one map into another
		tree_map.putAll(tree_map2);
		System.out.println("tree_map : " + tree_map);

		// all keys from a Tree Map
		System.out.println("All the keys : " + tree_map.keySet());
		// all the values
		System.out.println("All the values : " + tree_map.values());

		// key-value mapping associated with the greatest key and the least key in a
		// map.
		System.out.println("Lowest key in treemap :" + tree_map.firstEntry());
		System.out.println("Highest key in treemap :" + tree_map.lastEntry());

		// descending order
		System.out.println("descending key order: " + tree_map.descendingKeySet());
		// System.out.println("descending treemap: "+tree_map.descendingMap());

		// get the greatest key less than or equal to the given key.
		System.out.println("Key is: " + tree_map.floorKey(10)); // 10
		System.out.println("Key is: " + tree_map.floorKey(22)); // 20

		// get the least key strictly greater than the given key. Return null if there
		// is no such key.
		System.out.println("Key is: " + tree_map.higherEntry(10)); // 20=Green
		System.out.println("Key is: " + tree_map.higherEntry(22)); // 30=Black

		// greatest key strictly less than the given key.
		System.out.println("greatest key strictly less than the given key.");
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.lowerEntry(10));
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key(s): " + tree_map.lowerEntry(30));

		// get the portion of a map whose keys are strictly less than a given key.
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.headMap(10)); // Key(s): {}
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key(s): " + tree_map.headMap(30)); // Key(s): {10=Red, 20=Green}

		// get the portion of this map whose keys are less than
		// (or equal to, if inclusive is true) a given key.
		System.out.println("Checking the entry for 10: ");
		System.out.println("Key(s): " + tree_map.headMap(10, true)); // Key(s): {10=Red}
		System.out.println("Checking the entry for 30: ");
		System.out.println("Key(s): " + tree_map.headMap(30, true)); // Key(s): {10=Red, 20=Green, 30=Black}

		// remove and get a key-value mapping associated with the least key in a map.
		// polling first entry
		System.out.println("Value before poll: " + tree_map);
		System.out.println("Value returned: " + tree_map.pollFirstEntry());
		System.out.println("Value after poll: " + tree_map);

		SortedMap<Integer, String> sub_tree_map = new TreeMap<>();
		SortedMap<Integer, String> sub_tree_map2 = new TreeMap<>();
		System.out.println("Orginal TreeMap content: " + tree_map); // {20=Green, 30=Black, 40=White, 50=Orange, 60=Pink}
		sub_tree_map = tree_map.subMap(20, 40); 
		System.out.println("Sub map key-values: " + sub_tree_map); // Sub map key-values Exclusive: {20=Green, 30=Black} 
		sub_tree_map2 = tree_map.subMap(20, true,40,true); 
		System.out.println("Sub map key-values: " + sub_tree_map2); // {20=Green, 30=Black, 40=White}
	}

}
