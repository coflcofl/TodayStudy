package classExample;

class Papers3 {
    private String con;
    public Papers3(String s) {
        con = s;
    }

    public Printable getPrinter() {
        return new Printable() {
            public void print() {
                System.out.println(con);
            }
        };
    }
}
public class UseAnonymousInner {
    public static void main(String[] args) {
        Papers3 p = new Papers3("서류내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
