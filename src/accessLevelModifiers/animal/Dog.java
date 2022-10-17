package accessLevelModifiers.animal;

import accessLevelModifiers.zoo.Cat;

public class Dog {
    public void makeCat() {
        //Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
        Cat yaong = new Cat();
    }

    public void makeDuck() {
        //Duck은 default로 선언되었으므로 이 위치에서 인스턴스 생성 불가
        //Duck quack = new Duck();
    }
}
