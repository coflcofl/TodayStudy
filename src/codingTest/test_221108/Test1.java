package codingTest.test_221108;

import java.util.*;

public class Test1 {
    public int solution(int[] numbers) {
        int answer = 0;

        numbers = Arrays.stream(numbers).sorted().toArray();

        return numbers[numbers.length-1] * numbers[numbers.length - 2];
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int[] data = {0, 1, 1};
        System.out.println(test1.solution(data));
    }
}
