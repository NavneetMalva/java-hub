package collections.linkedlist;

public class CustomLinkedListUtil {

  static Node head;

  /**
   * To add the element in list
   *
   * @param data
   */
  public static void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
  }

  /**
   * To print the custom linkedList
   */
  public static void print() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.getData() + " ");
      curr = curr.getNext();
    }
  }

  /**
   * To sort the custom linkedList
   */
  public static void sort() {
    if (head == null || head.getNext() == null) return;

    boolean swapped;
    do {
      swapped = false;
      Node curr = head;
      while (curr.getNext() != null) {
        if (curr.getData() > curr.getNext().getData()) {
          int temp = curr.getData();
          curr.setData(curr.getNext().getData());
          curr.getNext().setData(temp);
          swapped = true;
        }
        curr = curr.getNext();
      }
    } while (swapped);
  }

}
