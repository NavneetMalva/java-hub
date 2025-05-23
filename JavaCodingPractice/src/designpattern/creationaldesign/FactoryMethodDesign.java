package designpattern.creationaldesign;

interface Animal {

  void speak();
}

class Cat implements Animal {

  @Override
  public void speak() {
    System.out.println("Cat says : Meow!!");
  }
}

class Dog implements Animal {

  @Override
  public void speak() {
    System.out.println("Dog says : Bow wow  !!");
  }
}

interface AnimalFactory {

  Animal createAnimal();
}

class DogFactory implements AnimalFactory {

  @Override
  public Animal createAnimal() {
    return new Dog();
  }
}

class CatFactory implements AnimalFactory {

  @Override
  public Animal createAnimal() {
    return new Cat();
  }
}

public class FactoryMethodDesign {

  public static void main(String[] args) {
    AnimalFactory dogFactory = new DogFactory();
    Animal dog = dogFactory.createAnimal();
    dog.speak();

    AnimalFactory catFactory = new CatFactory();
    Animal cat = catFactory.createAnimal();
    cat.speak();
  }
}
