package codingTest.test_230218;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public int solution(int n, int a, int b) {
        int answer = 1;

        while(true) {
            a = (a+1)/2;
            b = (b+1)/2;

            if(a == b) {
                break;
            }

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution(8, 4, 7));
    }
}
