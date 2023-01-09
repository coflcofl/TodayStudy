package lambda;

import java.util.Random;

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> {
            Random ran = new Random();
            return ran.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}
