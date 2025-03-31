package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx01 {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("black");
    list.add("red");
    list.add("blue");
    list.add("green");

    System.out.println(list);

    ListIterator<String> itr = list.listIterator();
    while (itr.hasNext()) {
      String s = itr.next();
      if (s.equals("red")) {
        itr.remove();
      } else if (s.equals("blue")) {
        itr.set("ocean blue");
      } else if (s.equals("green")) {
        itr.add("dark green");
      }
    }
    System.out.println(list);

  }
}

/**
 * ListIterator 1. By using Listiterator we can move either to the forward direction or to the
 * backward direction, and hence Listlterator is bidirectional cursor. 2. By using Listiterator we
 * can perform replacement and addition of new Objects in addition to read and remove operations.
 * <p>
 * Methods in ListIterator Listlterator is the child interface of Iterator and hence all methods of
 * Iterator by default available to Listiterator. Listiterator Interface defines the following 9
 * methods forward direction 1. public boolean hasNext () 2. public void next) 3. public int
 * nextindex () Backward direction 4. public boolean hasPrevious() 5. public void previous) 6.
 * public int previousIndex () other capability methods 7. public void remove() 8. public void
 * set(Object new) 9. public void add(object new)
 */
