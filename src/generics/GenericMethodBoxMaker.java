package generics;

public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        Box<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }
}
