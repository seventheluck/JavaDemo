package generics;

public class Plate2<T> {

    private T container;

    public Plate2(T t) {
        this.container = t;
    }

    public void set(T t) {
        container = t;
    }

    public T get() {
        return container;
    }
}
