package generics;

public class OrangeBox { //사과 담는 상자를 표현한 클래스
    private Orange or;

    public void set(Orange o) { //사과를 담는다
        or = o;
    }

    public Orange get() { //사과를 꺼낸다.
        return or;
    }
}
