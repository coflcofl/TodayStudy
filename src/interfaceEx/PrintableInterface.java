package interfaceEx;

public class PrintableInterface {
    public static void main(String[] args) {
        Printable prn = new Printer(); //Printable형 참조변수 선언 가능
        prn.print("Hello Java");
    }
}
