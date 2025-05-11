package strings;

public class StringNotes {
  public static void main(String[] args) {
    String s1 = "Mark";
    String s2 = "Mark";


    /**
     * As we know, Object class is the parent of all classes, and Object
     * class has a equals() method that compares the reference of two objects,
     * but String class has overridden this method, and String class’s equals()
     * method compares the contents of two strings.
     */
    System.out.println(s1.equals(s2));    // true
    System.out.println(s1 == s2);         // true


    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2= new StringBuilder("hello");

    System.out.println(sb1.equals(sb2));   // false
    /**
     * The output is not ‘Equal’
     * because StringBuﬀer and StringBuilder does not override equals and hashcode methods.
     * In the above program, Object’s class equals() method is getting used and as it compares the reference of two objects,
     * the output of the above program is 'Not Equal'
     */

  }


}
