package oops.polymorphism;

/**
 * Overriding wrt to var arguments
 * but here its not overriding, but its overloading
 * hence method resolution happening at compile time
 */

class P4{
    public void m4(int... i){
        System.out.println("Parent");
    }
}
class C4 extends P4{
    public void m4(int i){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        C4 child = new C4();
        child.m4(10); // child @CompileTime

        P4 parent = new P4();
        parent.m4(10); //parent @CompileTime

        P4 child2 = new C4();
        child2.m4(10); //parent -> method resolution happening at compile time

    }
}

/**
 * Overriding example
 */
class P5{
    public void m5(int... i){
        System.out.println("Parent");
    }
}
class C5 extends P5{
    public void m5(int... i){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        C5 child = new C5();
        child.m5(10); // child @Runtime

        P5 parent = new P5();
        parent.m5(10); //parent @Runtime

        P5 child2 = new C5();
        child2.m5(10); //child -> method resolution happening at Runtime because now its overriding
    }
}

/**
 * Overriding wrt to Variables
 *
 * overriding doesn't happen for variables, only for methods
 */

class P6{
    String s="Parent";
}
class C6 extends P6{
    String s="Child";

    public static void main(String[] args) {

        /**
         * Variable resolution always happens at compile time
         * Method resolution happening at compile time
         */
        C6 child = new C6();
        System.out.println(child.s); // child

        P6 parent = new P6();
        System.out.println(parent.s); // parent

        P6 child2 = new C6();
        System.out.println(child2.s); // parent
    }
}