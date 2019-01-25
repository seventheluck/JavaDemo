package generics;

public class Plate<T> {

    private T container;

    public Plate(T t) {
        this.container = t;
    }

    public void set(T t) {
        container = t;
    }

    public T get() {
        return container;
    }
}
