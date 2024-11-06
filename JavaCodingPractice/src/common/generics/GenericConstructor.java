package common.generics;

class Pod {

    private final Object value;

    public <T> Pod(T value) {
        this.value = value;
    }

    public String toString() {
        return "value" + " : " + value;
    }


}

public class GenericConstructor {
    public static void main(String[] args) {
        Pod pod = new Pod("Gojo");
        System.out.println(pod.toString());

    }
}
