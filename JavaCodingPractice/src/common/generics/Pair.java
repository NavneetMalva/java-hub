package common.generics;

// Example of Multiple generic parameters

public class Pair<K, V> {

  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public static void main(String[] args) {
    Pair<String, Integer> pair = new Pair<>("Morty", 16);
    System.out.println(pair.getKey() + " " + pair.getValue());

    Pair<String, String> pair2 = new Pair<>("Morty", "Jerry");
    System.out.println(pair2.getValue());


  }

}
