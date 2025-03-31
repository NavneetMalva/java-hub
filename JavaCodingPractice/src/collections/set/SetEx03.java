package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Set<String> hs = new HashSet<>();
    // use add() method to add values in the hash set
    hs.add("Red");
    hs.add("Green");
    hs.add("Black");
    hs.add("White");
    hs.add("Pink");
    hs.add("Yellow");

    // convert a hash set to an array.
    String[] arr = new String[hs.size()];
    hs.toArray(arr);
    for (String e : arr) {
      System.out.print(e + " ");
    }
    System.out.println();

    TreeSet<String> ts = new TreeSet<>(hs);
    System.out.println("ts: " + ts);

    Iterator itr = ts.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
    System.out.println();

    Iterator itrRev = ts.descendingIterator();
    while (itrRev.hasNext()) {
      System.out.print(itrRev.next() + " ");
    }


  }

}
