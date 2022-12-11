package classExtends;

public class CompFriend2 extends Friend{
    private String department;

    public CompFriend2(String na, String de, String ph) {
        super(na, ph);
        department = de;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}
