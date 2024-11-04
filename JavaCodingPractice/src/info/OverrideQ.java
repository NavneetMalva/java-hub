package info;

class A{
    static void methodA(){
        System.out.println("methodA");
    }

    static void methodB(){
        System.out.println("methodB");
    }
}

public class OverrideQ extends A {

    //@Override // we cant not use @Override annotation on a static method, it will starts giving error
    static void methodB(){
        System.out.println("methodB from class");
    }

    /**
     * In this case, methodB in OverrideQ is not an example of overriding.
     * This is because static methods in Java are not polymorphic;
     * they belong to the class in which they are defined, not to instances of the class.
     */

    public static void main(String[] args) {

        methodA();   // methodA
        // we dont need to create an instance to call the methodA (since static method )
        // it will work fine

        methodB();  // methodB from class

    }
}
