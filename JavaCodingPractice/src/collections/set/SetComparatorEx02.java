package collections.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyCustomComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            return o1.compareTo(o2);
        } else
            return o1.length() - o2.length();
    }
}

public class SetComparatorEx02 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new MyCustomComparator());
        set.add("Morty");
        set.add("Jonathan");
        set.add("Rick");
        set.add("John");
        set.add("Summer");
        System.out.println(set); // [John, Rick, Morty, Summer, Jonathan]
    }
}
