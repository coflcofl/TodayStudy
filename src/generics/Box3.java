package generics;

public class Box3<T extends Number & Eatable>{ //하나의 클래스와 하나 이상의 인터페이스에 대해 동시에 제한을 할 수 있음
    T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        System.out.println(ob.eat()); //Eatable로 제한하였기에 eat 호출 가능
        return ob;
    }
}
