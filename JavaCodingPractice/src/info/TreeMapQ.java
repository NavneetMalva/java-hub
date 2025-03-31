package info;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapQ {

  public static void main(String[] args) {

    Map<Integer, String> tp = new TreeMap<>();
    tp.put(1, "Rick");
    tp.put(2, "Bob");

    // what will happen if we try to insert null key in "TreeMap"
    /**
     * NullPointerException  on Runtime
     */
    tp.put(null, "Jack");

    for (Map.Entry<Integer, String> entry : tp.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }
}
