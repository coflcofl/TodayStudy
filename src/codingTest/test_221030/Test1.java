package codingTest.test_221030;

import java.util.*;

public class Test1 {
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
        Test1 test1 = new Test1();
        String data = "abcde";
        System.out.println(test1.solution(data));
    }
}
