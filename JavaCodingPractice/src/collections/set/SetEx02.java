package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = List.of("India", "Australia", "South Africa");

		Set<String> hs = new HashSet<>(l);
		Set<String> ls = new LinkedHashSet<>(l);
		Set<String> ts = new TreeSet<String>(l);
		System.out.println(hs + "\n" + ls + "\n" + ts);

//		[South Africa, Australia, India]  random order
//		[India, Australia, South Africa] maintains the insertion order
//		[Australia, India, South Africa] insert in sorted order
		
		// will do same thing to add the elements in treeset
//		Set<String> ts2 = new TreeSet<String>();
//		for(String s: l) {
//			ts2.add(s);
//		}
//		System.out.println(ts2);

	}

}
