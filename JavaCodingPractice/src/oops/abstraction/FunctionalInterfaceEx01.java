package oops.abstraction;

/**
 * An Interface that contains exactly one abstract method is known as functional interface.
 * It can have any number of default, static methods but can contain only one abstract method.
 *
 * Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 */

@FunctionalInterface
interface Sayable{
    void say(String str);
}

public class FunctionalInterfaceEx01 implements Sayable{
    @Override
    public void say(String str) {
        System.out.println("Hello, "+ str);
    }

    public static void main(String[] args) {
        FunctionalInterfaceEx01 fi = new FunctionalInterfaceEx01();
        fi.say("Morty");
    }

}
