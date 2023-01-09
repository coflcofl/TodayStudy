package lambda;

public class Lambda3 {
    public static void main(String[] args) {
        Printable prn = (s) -> {
            System.out.println(s);
        };
        prn.print("What is Lambda?");
    }
}
