package common;

/**
 * We can use this as well as super anywhere except static area. if  we use this as well as super
 * inside public static void main(String[]args) we will get Compile Time Error since cannot use them
 * inside static area. We can use this as well as super any number of times in a program.
 */

class Animal {

  String type;

  Animal(String type) {
    this.type = type;
  }
}

class Dog extends Animal {

  String sound;

  Dog(String type, String sound) {
    super(type); // invoking superclass constructor
    this.sound = sound; // using 'this' to refer to the current object's instance variable
  }
}

public class SuperAndThis {

  public static void main(String[] args) {
    Animal animal = new Animal("Husky");
    System.out.println(animal.type);

    Dog dog = new Dog(animal.type, "Bark");
    System.out.println(dog.type + " " + dog.sound);

  }
}
