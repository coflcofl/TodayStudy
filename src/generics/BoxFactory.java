package generics;

public class BoxFactory {
    public static <T> Box<T> makeBox(T o) { //제네릭 메소드의 정의
        Box<T> box = new Box<T>(); //상자를 생성하고,
        box.set(o); //전달된 인스터스를 상자에 담아서,
        return box; //이 상자를 반환한다.
    }
}
