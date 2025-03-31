package common;

public class SmallestWordFinder {

  public static void main(String[] args) {
    String sentence = "Find the smallest length word in this string";

    String smallestWord = findSmallestWord(sentence);
    System.out.println("The smallest word is: " + smallestWord);
  }

  private static String findSmallestWord(String sentence) {
    String[] words = sentence.split(" ");
    String smallestword = words[0];
    for (String word : words) {
      if (word.length() < smallestword.length()) {
        smallestword = word;
      }
    }
    return smallestword;
  }
}
