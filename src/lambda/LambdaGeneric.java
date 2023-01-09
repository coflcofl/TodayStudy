package lambda;

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate3<Integer> ci = (a, b) -> a + b;
        System.out.println(ci.cal(4, 3));

        Calculate3<Double> cd = (a, b) -> a + b;
        System.out.println(cd.cal(4.32, 3.45));
    }
}
