package generics.wildcard;

import generics.Box;

class BoxHandler {
    public static void outBox(Box<? extends Toy> box) {
        Toy t = box.get();
        System.out.println(t);
    }

    public static void inBox(Box<Toy> box, Toy n) {
        box.set(n);
    }
}
public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
