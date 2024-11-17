package oops.polymorphism;

class MethodOverloading02 {
    public void m1(Object o){
        System.out.println("Object method");
    }
    public void m1(String s){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        MethodOverloading02 ml = new MethodOverloading02();
        ml.m1(new Object());
        ml.m1("Smith");
        ml.m1(null);  // String method
        // because Object is Parent class and String is Child of Object class
        // so null is best match with String which is closer to it.
        // if child class is not available then it will go for Parent class.
    }
}


class MethodOverloading03{
    public void m1(String s){
        System.out.println("String Method");
    }
    public void m1(StringBuffer sb){
        System.out.println("StringBuffer Method");
    }

    public static void main(String[] args) {
        MethodOverloading03 ml = new MethodOverloading03();
        ml.m1("Morty");
        ml.m1(new StringBuffer("Smith"));
        // ml.m1(null); // ERROR : reference to m1 is ambiguous
    }

}

class MethodOverloading04{
    public void m1(int i){
        System.out.println("General Method");
    }
    public void m1(int... i){
        System.out.println("var-arg method");
    }
    public static void main(String[] args) {
        MethodOverloading04 methodOverloading = new MethodOverloading04();
        methodOverloading.m1(); // var
        methodOverloading.m1(10); // gen
        methodOverloading.m1(5,10); // var
    }
}
