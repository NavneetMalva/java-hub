package oops.polymorphism;

/**
 *
 * NOTE : private < default < protected < public
 *
 * if Parent public -> child Public
 * protected -> protected/public
 * default -> default/protected/public
 * private -> overriding does not happen for private methods.
 *
 * since method m1 is private, Its not visible to Class C, hence this is not overriding.
 */
class P{
    private void m1(){
        System.out.println("private m1 method P");
    }
}

class C extends P{

    private void m1(){
        System.out.println("m1 method C");
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();

        P p = new C();
        // p.m1();  // ERROR: m1() has private access in P
    }
}

/**
 * since method m1 is static, It can not be override in C1
 * It is not overriding in C1, method m1 in C1 is independent to method m1 in P1
 * hence we can't annotate with @Override m1 in C1.
 */


class P1{
    public static void m1(){
        System.out.println("m1 p1");
    }
}
class C1 extends P1{
    // @Override  // Static methods cannot be annotated with @Override
    public static void m1(){
        System.out.println("m1 c1");
    }

    public static void main(String[] args) {
        C1 child = new C1();
        child.m1(); // m1 c1 -> according to ref type

        P1 parent = new P1();
        parent.m1(); // m1 p1 -> according to ref type

        P1 child2 = new C1();
        child2.m1(); // m1 p1 -> according to ref type
        /**
         * if it was overriding, method resolution should happen at runtime
         * and output should be m1 c1, but thats not the case.
         * It is example of method hiding.
         */

    }
}


/**
 * non-final is converted to final
 */
class P2 {
    public void m2(){
        System.out.println("parent m2");
    }
}
class C2 extends P2{
    @Override
    public final void m2() {
        System.out.println("child m2");
    }

    public static void main(String[] args) {
        C2 child = new C2();
        child.m2(); // child m2
    }
}

/**
 * We can't reduce scope of modifier
 * But we can increase scope
 */

class P3{
    public void m3(){
        System.out.println("m3 method P");
    }
    protected void m4(){
        System.out.println("m4 method P");
    }
}
class C3 extends P3{
   // This will throw error since we are making it protected from public.
    /*
    protected void m3(){
        System.out.println("m3 method C");
    }
    */

    // we are increasing the scope from protected to public
    @Override
    public void m4(){
        System.out.println("m4 method C");
    }

    public static void main(String[] args) {
        C3 child = new C3();
        child.m3(); //  m3 method P
        child.m4(); // m4 method C
    }
}