package classExtends;

public class UnivFriend2 extends Friend{
    private String major;

    public UnivFriend2(String na, String ma, String ph) {
        super(na, ma);
        major = ma;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }
}
