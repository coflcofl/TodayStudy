package interfaceEx;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        prn = new Prn731Drv();
        prn.print(myDoc);
    }
}
