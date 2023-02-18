package codingTest.test_230218;

import classExtends.ParentAdder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test2 {
    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1) {
            answer = arr[0];
        } else {
            int gcd = getGCD(arr[0], arr[1]);
            int lcm = (arr[0] * arr[1]) / gcd;

            for (int i = 2; i < arr.length; i++) {
                gcd = getGCD(lcm, arr[i]);
                lcm = (lcm * arr[i]) / gcd;
            }
            answer = lcm;
        }
        return answer;
    }

    public int getGCD(int n1, int n2) {
        int gcd = n1 % n2;

        if(gcd == 0) {
            return n2;
        }

        return getGCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int[] arr = new int[]{2, 6, 8, 14};

        System.out.println(t2.solution(arr));
    }
}
