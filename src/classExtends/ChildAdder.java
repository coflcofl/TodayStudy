package classExtends;

public class ChildAdder extends ParentAdder {
    //상위 클래스의 add를 오버라이딩 하려 합니다.
    //@Override
    public double add(double a, double b) {
        System.out.println("덧셈을 진행합니다.");
        return a + b;
    }
}
