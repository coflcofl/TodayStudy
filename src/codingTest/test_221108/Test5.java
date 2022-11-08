package codingTest.test_221108;

import java.util.*;

public class Test5 {
    public int solution(int[] sides) {
        int answer = 0;

        sides = Arrays.stream(sides).sorted().toArray();

        return sides[2] > sides[0] + sides[1] ? 1 : 2;
    }

    public static void main(String[] args) {
        Test5 t5 = new Test5();

        int[] a = {199, 72, 222};
        System.out.println(t5.solution(a));
    }
}
