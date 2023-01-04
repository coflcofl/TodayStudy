package generics;

public class Box2<T extends Number> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }

    public int toIntValue() {
        return ob.intValue();
    }
}
