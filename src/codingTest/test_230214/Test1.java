package codingTest.test_230214;

import methodOverloading.Test;

import java.util.Arrays;

public class Test1 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        String[] ansArr = new String[strArr.length];

        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].length() == 0) {
                answer += " ";
            } else {
                answer += strArr[i].substring(0, 1).toUpperCase().concat(strArr[i].substring(1, strArr[i].length()).toLowerCase());
                answer += (i == strArr.length - 1) ? "" : " ";
            }
        }

        answer = answer.charAt(answer.length() - 1) == ' ' ? answer.substring(0, answer.length() - 1) :  answer;

        return answer;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution("tdd "));
    }
}


