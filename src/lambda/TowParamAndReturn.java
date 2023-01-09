package lambda;

public class TowParamAndReturn {
    public static void main(String[] args) {
        Calculate2 c;
        c = (a, b) -> {return a + b;};
        System.out.println(c.cal(4, 3));

        c = (a, b) -> a + b;
        System.out.println(c.cal(4, 3));
    }
}
