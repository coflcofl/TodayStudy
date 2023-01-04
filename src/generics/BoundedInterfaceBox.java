package generics;

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple());

        Apple ap = box.get();
        System.out.println(ap);
    }
}
