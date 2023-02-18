package codingTest.test_230215;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while(true) {
            n++;

            if(count == Integer.bitCount(n)) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();

        System.out.println(t4.solution(15));
    }
}
