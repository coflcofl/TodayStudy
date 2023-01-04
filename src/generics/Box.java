package generics;

public class Box<T> { //무엇이든 담을 수 있는 상자
    protected T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }

    /*
    public int toIntValue() {
        return ob.intValue();
    }
    */
}
