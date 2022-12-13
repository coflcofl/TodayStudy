package interfaceEx;

public class Prn204Drv implements Printable { //S사의 흑백 프린터 드라이버
    @Override
    public void print(String doc) {
        System.out.println("From MD-204 printer");
        System.out.println(doc);
    }
}
