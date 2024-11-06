package common.generics;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            throw new MyException(123);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        try{
            throw new MyException("dummyMessage");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


class MyException extends Exception{
    public <T> MyException(T value){
        super("Exception related to value : "+
                value.toString()+
                " of type : "+
                value.getClass().getName());
    }

}


/**
 * Use generics in exception fields: Instead of making the exception class itself generic,
 * use generic fields to store error-related information.
 */
