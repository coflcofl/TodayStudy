package generics;

public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox aBox = new AppleBox(); //사과 상자 생성
        OrangeBox oBox = new OrangeBox(); //오렌지 상자 생성

        aBox.set(new Apple()); //사과를 사과상자에 담는다.
        oBox.set(new Orange()); //오렌지를 오렌지상자에 담는다.

        Apple ap = aBox.get();
        Orange og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
