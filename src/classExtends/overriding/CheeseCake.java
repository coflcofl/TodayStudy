package classExtends.overriding;

public class CheeseCake extends Cake{
    public void yummy() { //cake의 yummy 메소드를 오버라이딩함
        super.yummy(); //Cake의 yummy 메소드 호출
        System.out.println("Yummy Cheese Cake");
    }

    public void tasty() {
        super.yummy(); //Cake의 yummy 메소드 호출
        System.out.println("Yummy Tasty Cake");
    }
}
