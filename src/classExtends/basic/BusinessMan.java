package classExtends.basic;

public class BusinessMan extends Man{
    String company;
    String position;

    public BusinessMan(String name, String company, String position) {
        //상위 클래스 Man의 멤버 초기화
        super(name);

        //클래스 BusinessMan의 멤버 초기화
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();
    }
}
