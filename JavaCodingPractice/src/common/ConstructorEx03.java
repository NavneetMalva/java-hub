package common;

/**
 * Key Concept: Constructor Invocation Order
 *
 * In Java, when a child class constructor is invoked, the parent class constructor is automatically called first (even if not explicitly stated).
 * The no-argument constructor of the parent class is called unless a specific constructor is explicitly invoked using super().
 */
class Parent {
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child() {
        System.out.println("child constructor.");
    }

    public static void main(String[] args) {
        Child c = new Child();
        /**
         * Parent constructor
         * Child constructor
         */
    }
}

/**
 * calling explicitly 
 */
class Parent1 {
    public Parent1(){
        System.out.println("Parent Constructor");
    }
    public Parent1(String name){
        System.out.println("parent argument constructor");
    }
}
class Child1 extends Parent1{

    public Child1(String name) {
        super(name);  // calling explicitly
        System.out.println("child constructor");
    }

    public static void main(String[] args) {
        Child1 c = new Child1("Morty");
        /**
         * parent argument constructor
         * Child constructor
         */
    }
}


