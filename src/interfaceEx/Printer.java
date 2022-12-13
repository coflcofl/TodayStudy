package interfaceEx;

public class Printer implements Printable{ //Printable을 구현하는 Printer 클래스
    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}
