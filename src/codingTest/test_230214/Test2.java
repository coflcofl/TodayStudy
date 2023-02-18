package codingTest.test_230214;

import java.util.Arrays;

public class Test2 {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int[] a = {1,4,2};
        int[] b = {5,4,4};
        System.out.println(t2.solution(a, b));
    }
}
