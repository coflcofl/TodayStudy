package classExample;

class Papers2 {
    private String con;
    public Papers2(String s) {
        con = s;
    }

    public Printable getPrinter() {
        class Printer implements Printable { //로컬 클래스의 정의
            public void print() {
                System.out.println(con);
            }
        }

        return new Printer(); //로컬 클래스의 인스턴스 생성 및 반환
    }
}
public class UseLocalInner {
    public static void main(String[] args) {
        Papers2 p = new Papers2("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
