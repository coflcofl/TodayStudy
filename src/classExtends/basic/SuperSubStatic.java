package classExtends.basic;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS2 obj1 = new SuperCLS2(); //count++
        SuperCLS2 obj2 = new SuperCLS2(); //count++

        //아래 인스턴스 생성 과정에서 SuperCLS 생성자 호출되므로
        SubCLS2 obj3 = new SubCLS2(); //count++
        obj3.showCount();
    }
}
