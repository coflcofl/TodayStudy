package generics;

public class AppleBox { //사과 담는 상자를 표현한 클래스
    private Apple ap;

    public void set(Apple a) { //사과를 담는다
        ap = a;
    }

    public Apple get() { //사과를 꺼낸다.
        return ap;
    }
}
