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
/**
Explanation:
The try block returns 10. Normally, this would return from the method.
If an exception were thrown, the catch block would return 20. However, no exception occurs in this case.
The finally block always executes, and since it also contains a return statement (return 30;),
 it overrides any previous return value from the try or catch block.
// ans : 30
 */
