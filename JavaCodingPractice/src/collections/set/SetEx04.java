package collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx04 {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("A");
        hs.add("A");
        hs.add("B");
        hs.add(10);
        hs.add(20);  // hetrogeneous insertion is allowed in set
        System.out.println(hs.add("B")); // false
        System.out.println(hs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        // ts.add(null); // will throw error on runtime
        ts.add(String.valueOf((10))); // string
        System.out.println(ts);

        TreeSet<Object> tss = new TreeSet<>();
        tss.add("A");
        // tss.add(1); // java: incompatible types: int cannot be converted to java.lang.String
        // hetrogenous not allowed in TreeSet and TreeMap
        System.out.println(tss);


    }
}
