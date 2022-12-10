package classExtends.basic;

public class SubCLS extends SuperCLS{
    public SubCLS() { //생성자
        System.out.println("Con: SubCLS()");
    }
    public SubCLS(int i) {
        super(i); //상위 클래스의 생성자를 지정 및 호출
        System.out.println("Con: SubCLS(int i)");
    }
    public SubCLS(int i, int j) {
        super(i, j); //상위 클래스의 생성자 지정 및 호출
        System.out.println("Con: SubCLS(int i, int j)");
    }
}
