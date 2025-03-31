package designpattern.creationaldesign;

/**
 * Singleton Design Pattern Principles Below are the principles of the Singleton Pattern:
 * <p>
 * Single Instance: Singleton ensures that only one instance of the class exists throughout the
 * application. Global Access: Provide a global point of access to that instance. Lazy or Eager
 * Initialization: Support creating the instance either when needed (lazy) or when the class is
 * loaded (eager). Thread Safety: Implement mechanisms to prevent multiple threads from creating
 * separate instances simultaneously. Private Constructor: Restrict direct instantiation by making
 * the constructor private, forcing the use of the access point
 */
class SingletonLazyDesign {

  private static SingletonLazyDesign instance;

  private SingletonLazyDesign() {
  }

  public static SingletonLazyDesign getInsance() {
    if (instance == null) {
      instance = new SingletonLazyDesign();
    }
    return instance;
  }
}

class EagerSingleton {

  // Eager way of creating the singleton Object
  private static EagerSingleton eagerInstance = new EagerSingleton();

  public static EagerSingleton getInstance() {
    return eagerInstance;
  }
}

class ThreadSafetySingleton {

  private static ThreadSafetySingleton threadInstance;

  private ThreadSafetySingleton() {
  }

  public static ThreadSafetySingleton getInstance() {
    if (threadInstance == null) {
      synchronized (ThreadSafetySingleton.class) {
        if (threadInstance == null) {
          threadInstance = new ThreadSafetySingleton();
        }
      }
    }
    return threadInstance;
  }

}

class MainSingleton {

  public static void main(String[] args) {

    /**
     * 1.Make Constructor private to restrict the access
     * 2.create the static instance
     * 3.Create the static method to create the instance of the class
     *
     * This is example of Lazy initialization, created instance when it was needed.
     */

    SingletonLazyDesign singletonLazyDesign = SingletonLazyDesign.getInsance();
    System.out.println(singletonLazyDesign.hashCode()); // 2055281021

    SingletonLazyDesign singletonLazyDesign2 = SingletonLazyDesign.getInsance();
    System.out.println(singletonLazyDesign2.hashCode()); // 2055281021

    System.out.println(EagerSingleton.getInstance());
    System.out.println(EagerSingleton.getInstance());

  }
}