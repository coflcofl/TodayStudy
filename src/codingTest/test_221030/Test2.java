package codingTest.test_221030;

import java.util.*;

public class Test2 {
    public String solution(String my_string) {
        String answer = "";
        String[] string = my_string.split("");
        String[] answerArr = new String[string.length];

        for(int i=0; i<string.length; i++) {
            answerArr[i] = string[string.length - 1 - i];
        }

        for(String a : answerArr) {
            answer += a;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        String data = "abcde";
        System.out.println(test2.solution(data));
    }
}
