package collections.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o2.compareTo(o1);
  }
}

public class SetComparator {

  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
    treeSet.add(10);
    treeSet.add(9);
    treeSet.add(12);
    treeSet.add(100);
    System.out.println(treeSet); // [100, 12, 10, 9]
  }
}

// Various possible implementations of compare method:[10,0,15,20,20]
class MyComparatorDiff implements Comparator<Object> {

  public int compare(Object obj1, Object obj2) {
    Integer i1 = (Integer) obj1;
    Integer i2 = (Integer) obj2;
    //return i1.compareTo(i2);  //[0,10,15,20] ascending order
    // return -i1.compareTo(i2); //[20,15,10,0] descending order
    //return i2.compareTo(i1); //[20,15,10,01] descending order
    // return -i2.compareTo(i1); //[0,10,15,20] ascending order
    // return +1 // [10,0,15,20,20] Insertion order // even the duplicates got inserted
    // return -1 //[20,20,15,0,10] Reverse of Insertion order // even the duplicates got inserted
    return 0; // [10] (only first element will be inserted and all the other elements are considered as duplicates)
  }
}