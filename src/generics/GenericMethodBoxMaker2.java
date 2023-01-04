package generics;

public class GenericMethodBoxMaker2 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("My Generic Method");

        String str = Unboxer.openBox(box);
        System.out.println(str);
    }
}
