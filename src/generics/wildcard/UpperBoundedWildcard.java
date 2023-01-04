package generics.wildcard;

import generics.Box;

class Unboxer {
    public static void peekBox(Box<? extends Number> box) {
        System.out.println(box);
    }
}
//상한 제한된 와일드카드
public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(1234);

        Box<Double> dBox = new Box<>();
        dBox.set(3.33);

        Unboxer.peekBox(iBox);
        Unboxer.peekBox(dBox);
    }
}
