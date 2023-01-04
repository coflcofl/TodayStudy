package generics;

public class BoxFactory2 {
    public static <T extends Number> Box<T> makeBox(T o) {
        Box<T> box = new Box<T>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}
