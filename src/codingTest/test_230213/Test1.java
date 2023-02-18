package codingTest.test_230213;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];

        for(int i=0; i<strArr.length; i++) {
            intArr[i] = Integer.valueOf(strArr[i]);
        }
        Arrays.sort(intArr);

        return intArr[0] + " " + intArr[strArr.length - 1];
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution("-1 -3 -4"));
    }
}
