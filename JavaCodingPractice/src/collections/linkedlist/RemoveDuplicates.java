package collections.linkedlist;

import java.util.Scanner;

public class RemoveDuplicates {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the list : ");
    int l = scanner.nextInt();
    System.out.println("Insert Elements in the list");
    for (int i = 0; i < l; i++) {
      int e = scanner.nextInt();
      CustomLinkedListUtil.insert(e);
    }

    CustomLinkedListUtil.sort();
    System.out.println("sorted list before duplication deletion : "  );
    CustomLinkedListUtil.print();

    RemoveDuplicates ll = new RemoveDuplicates();

    // Remove duplicates
    ll.removeDuplicates(CustomLinkedListUtil.head);

    // Print final list
    System.out.print("\nList after removing duplicate elements: ");
    CustomLinkedListUtil.print(); // This directly prints the list
  }


  Node removeDuplicates(Node head) {
    Node curr = head;

    while (curr != null && curr.getNext() != null) {
      if (curr.getData() == curr.getNext().getData()) {
        // remove current node
        curr.setNext(curr.getNext().getNext());

      } else {
        curr = curr.getNext();
      }
    }
    return head;
  }

}
