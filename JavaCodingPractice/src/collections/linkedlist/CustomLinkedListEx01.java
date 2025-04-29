package collections.linkedlist;

public class CustomLinkedListEx01 {

  public static void main(String[] args) {

    CustomLinkedListUtil.insert(5);
    CustomLinkedListUtil.insert(10);
    CustomLinkedListUtil.insert(21);
    CustomLinkedListUtil.insert(5);
    CustomLinkedListUtil.insert(8);

    CustomLinkedListUtil.insert(9);
    CustomLinkedListUtil.insert(14);
    CustomLinkedListUtil.insert(8);
    CustomLinkedListUtil.insert(21);
    CustomLinkedListUtil.print();

    // Now sort this linkedList
    CustomLinkedListUtil.sort();
    System.out.println("\nlinkedList after sorting...");
    CustomLinkedListUtil.print();
  }
}
