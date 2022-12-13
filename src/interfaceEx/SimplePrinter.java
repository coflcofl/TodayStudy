package interfaceEx;

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable prn = new Printer();
        prn.print(myDoc);

        //인터페이스의 static 메소드 직접 호출
        Printable2.printLine("end of line");
    }
}
