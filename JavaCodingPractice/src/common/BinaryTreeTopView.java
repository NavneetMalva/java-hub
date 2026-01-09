package common;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * BinaryTreeTopView.java
 * Created by Navneet Malva on 02/01/26 : 19:02.
 */
public class BinaryTreeTopView {

  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
    }
  }

  static class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }
  }

  public static void topView(Node root) {

    if (root == null) return;

    Map<Integer, Integer> map = new TreeMap<>();
    Queue<Pair> queue = new LinkedList<>();

    queue.add(new Pair(root, 0));

    while (!queue.isEmpty()) {
      Pair current = queue.poll();

      map.putIfAbsent(current.hd, current.node.data);

      if (current.node.left != null) {
        queue.add(new Pair(current.node.left, current.hd - 1));
      }

      if (current.node.right != null) {
        queue.add(new Pair(current.node.right, current.hd + 1));
      }

    }
    map.values().forEach(v -> System.out.print(v + " "));

  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.right = new Node(4);
    root.left.right.right = new Node(5);
    root.left.right.right.right = new Node(6);

    topView(root);

  }

}
