package designpattern.creationaldesign.singletondesign;

class Parent implements Cloneable {
  int x = 20;

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class Singleton extends Parent {
  public static final Singleton instance = new Singleton();

  private Singleton() {
  }
}

class BreakSingletonUsingClone {
  public static void main(String[] args) throws CloneNotSupportedException {
    Singleton instance1 = Singleton.instance;
    Singleton instance2 = (Singleton) instance1.clone();

    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());

    // As you can see, both instances have diﬀerent hashcode indicating our
    // Singleton pattern is broken, so to prevent this, we can override clone
    // method in our Singleton class and either return the same instance or throw
    // CloneNotSupportedException from it.

    PreventBreakingSingleton instance3 = PreventBreakingSingleton.instance;
    PreventBreakingSingleton instance4 = (PreventBreakingSingleton) instance3.clone();
    System.out.println(instance3.hashCode());
    System.out.println(instance4.hashCode());
  }
}


class PreventBreakingSingleton extends Parent {
  public static final PreventBreakingSingleton instance = new PreventBreakingSingleton();

  private PreventBreakingSingleton() {
  }

  // 1st way - throw the exception
  //@Override
  public Object clone2() {
    return new CloneNotSupportedException();
  }

  // 2nd way - return the same instance
  @Override
  public Object clone() {
    return instance;
  }
}
