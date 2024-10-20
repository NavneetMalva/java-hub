package info;

// what will be the value of Method A

public class ExceptionQ {

    public int methodA() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        ExceptionQ ex = new ExceptionQ();
        int a = ex.methodA();

        System.out.println(a);
    }

}

// ans : 30
