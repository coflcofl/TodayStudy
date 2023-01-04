package generics;

public class BoundedGenericMethod {
    public static void main(String[] args) {
        Box<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
        int n = Unboxer2.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}
