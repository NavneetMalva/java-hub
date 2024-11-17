package oops.polymorphism;

class Animal{}
class Monkey extends Animal{}
class MethodOverloading06 {
    public void m1(Animal a) {
        System.out.println("Animal version");
    }
    public void m1(Monkey m) {
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {
        MethodOverloading06 ml = new MethodOverloading06();
        Monkey m = new Monkey();
        ml.m1(m);   // monkey

        Animal a = new Animal();
        ml.m1(a); // animal

        // Parent class can hold the reference
        // but in overloading, method overloading takes care at compile time based on reference type.
        Animal monkey = new Monkey();
        ml.m1(monkey);  // Animal
    }

}
