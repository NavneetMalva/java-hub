package common.generics;

public class GenericContainer<T> implements Container<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item=item;
    }

    @Override
    public T get() {
        return item;
    }

    public static void main(String[] args) {
        GenericContainer<String> gc = new GenericContainer<>();
        gc.add("Apple");
        System.out.println(gc.get());
    }
}
