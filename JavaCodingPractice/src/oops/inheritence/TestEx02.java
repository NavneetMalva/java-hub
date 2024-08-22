package oops.inheritence;

class Base02 {
    public Base02() {
        System.out.print("Base ");
    }

    public Base02(String s) {
        System.out.print("BaseStr: " + s);
    }
}

class Derived02 extends Base02 {
    public Derived02(String s) {
//        super(); // Stmt-1 	// Uncomment only 1 statement at a time
//        super(s); // Stmt-2 // Uncomment only 1 statement at a time
        System.out.print("Derived ");
    }
}

class TestEx02 {
    public static void main(String[] args) {
        Base02 base = new Derived02("Hello ");
    }
}
