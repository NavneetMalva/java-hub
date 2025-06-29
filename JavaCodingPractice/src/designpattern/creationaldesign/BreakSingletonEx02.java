package designpattern.creationaldesign;

import java.io.*;

/**
 * Demonstrates how serialization can break the Singleton design pattern.
 * <p>
 * The class {@code A} is implemented as a singleton with a private constructor
 * and a public static final instance. However, because it implements {@link Serializable},
 * serialization and later deserialization can create a new instance,
 * thus violating the singleton property.
 * The {@code BreakSingletonUsingSerialization} class serializes the singleton instance
 * to a file and then deserializes it back, resulting in two distinct instances.
 * This is evidenced by the different hash codes printed for the original and deserialized instances.
 * To prevent this issue, the singleton class should implement the {@code readResolve()} method
 * to return the existing singleton instance during deserialization.
 * </p>
 *
 * @author Navneet Malva
 */
class A implements Serializable {
  private static final long serialVersionUID = 20L;

  private A() {
  }

  public static final A instance = new A();

  // To prevent from Breaking Singleton Pattern
  protected Object readResolve() {
    System.out.println("readResolve() method is called...");
    return instance;
  }
}

class BreakSingletonUsingSerialization {
  public static void main(String[] args) {
    A instance1 = A.instance;
    A instance2 = null;
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializedA.txt"));
      oos.writeObject(instance1);
      oos.close();

      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializedA.txt"));
      instance2 = (A) ois.readObject();
      ois.close();
    } catch (Exception e) {
      System.out.println("Exception occurred.");
    }

    System.out.println("instance1 : " + instance1.hashCode());
    System.out.println("instance2 : " + instance2.hashCode());
  }
}
