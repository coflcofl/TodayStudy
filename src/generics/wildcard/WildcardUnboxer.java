package generics.wildcard;

import generics.Box;
import generics.Unboxer;

public class WildcardUnboxer {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("So Simple String");

        Unboxer.peekBox(box);
    }
}
