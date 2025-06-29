package designpattern.creationaldesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Reflection: Reflection API in java is used to change the runtime behavior of
 * a class. Hibernate, Spring’s Dependency injection also uses Reflection. So,
 * even though in the above singleton implementations, we have defined the
 * constructor as private, but using Reflection, even private constructor can
 * be accessed, so Reflection can be used to break the singleton property of a class.
 */

class ReflectionEx {

  private ReflectionEx() {
  }

  public static final ReflectionEx instance = new ReflectionEx();
}

class BreakSingleton {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    ReflectionEx instance1 = ReflectionEx.instance;
    ReflectionEx instance2 = null;

    Constructor<ReflectionEx> constructor = ReflectionEx.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    instance2 = constructor.newInstance();

    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class PreventReflection {

  public static final PreventReflection instance = new PreventReflection();

  private PreventReflection() {
    if (PreventReflection.instance != null) {
      throw new RuntimeException("This object creation is not allowed.");
    }
  }

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    PreventReflection instance1 = PreventReflection.instance;
    PreventReflection instance2 = null;

    Constructor<PreventReflection> declaredConstructor = PreventReflection.class.getDeclaredConstructor();
    declaredConstructor.setAccessible(true);
    instance2 = declaredConstructor.newInstance();
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }

}