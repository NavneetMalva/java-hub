package oops.inheritence;

class Animal {

  public void makeSound() {
    System.out.println("Animal making a sound.");
  }
}

public class Cat extends Animal {

  // Use the @Override annotation to indicate that this method overrides a method in the superclass
  @Override
  public void makeSound() {
    System.out.println("The cat quarrels.");
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.makeSound();

    Animal animal = new Animal();
    animal.makeSound();

  }
}
