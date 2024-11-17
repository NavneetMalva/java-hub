package oops.abstraction;

abstract class AbstractMethod {
    public abstract void m1();
}

/**
 * if class contains at least one abstract method, we have to declare class as 'abstract'.
 * abstract class can have zero number of abstract method.
 */

class Main extends AbstractMethod{

    @Override
    public void m1() {
        System.out.println("method m1");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
    }
}
