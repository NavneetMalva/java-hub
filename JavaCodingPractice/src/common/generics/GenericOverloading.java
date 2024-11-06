package common.generics;

import java.math.BigDecimal;

public class GenericOverloading {

    public static void main(String[] args) {
        display(123);
        display(123.45);
        display(999L);
        display("hello, world!");
        display(new BigDecimal(10001));
    }

    public static <T extends Number> void display(T value){
        System.out.println("Generic method value : "+ value + " of type "+ value.getClass().getName());
    }

    public static <T extends Integer> void display(T value){
        System.out.println("Integer specific value : "+value+ " of type "+ value.getClass().getName());
    }

    public static <T> void display(T value){
        System.out.println("Any other value : "+value+ " of type "+ value.getClass().getName());
    }


}
