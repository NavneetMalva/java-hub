package interview.cognizant;

/*
ConcurrentModificationException happens when a collection’s structure (like adding/removing elements) is modified
while iterating and the modification is not made through the iterator itself.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationList {
  public static void main(String[] args) {

    List<String> originalList = new ArrayList<>();
    originalList.add("Java");
    originalList.add("Spring");
    originalList.add("Hibernate");

    for (String tech : originalList) {
      if (tech.equals("Java")) {
        // originalList.remove(tech); // ❌ modifies the list directly
      }
    }
    System.out.println("1-" + originalList);

    Iterator<String> iterator = originalList.iterator();
    while (iterator.hasNext()) {
      String tech = iterator.next();
      if (tech.equals("Java")) {
        // iterator.remove(); // ✅ modifies list through iterator safely
        // originalList.remove(tech); // ❌ modifies the list directly
      }
    }
    System.out.println("2-" + originalList);
  }
}

// Prevent concurrent modification Error
// 1. By making a copy of the list and working on the copy
class CopyListExample {
  public static void main(String[] args) {
    List<String> originalList = new ArrayList<>();
    originalList.add("Java");
    originalList.add("Spring");
    originalList.add("Hibernate");

    // Create a copy of the list before iteration
    List<String> copyList = new ArrayList<>(originalList);

    for (String tech : copyList) {
      if (tech.equals("Spring")) {
        originalList.remove(tech); // ✅ Safe – not modifying the iterated list
      }
    }
    System.out.println("Updated List: " + originalList);
  }
}
