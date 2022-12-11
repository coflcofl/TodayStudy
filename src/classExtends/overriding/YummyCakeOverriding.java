package classExtends.overriding;

public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy(); //오버라이딩 한 CheeseCake의 yummy 메소드 호출됨
        c2.yummy(); //오버라이딩 한 CheeseCake의 yummy 메소드 호출됨
    }
}
