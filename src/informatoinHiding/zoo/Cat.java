package informatoinHiding.zoo;

//Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
public class Cat {
    public void makeCat() {
        //Duck과 같은 패키지로 묶여 있으니 Duck 인스턴스 생성 가능
        Duck quack = new Duck();
    }
}
