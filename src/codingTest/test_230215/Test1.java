package codingTest.test_230215;

import classExtends.ParentAdder;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                count ++;
            }
            if(ch == ')') {
                count --;
            }
            if(count < 0) {
                break;
            }
        }

        answer = count == 0 ? true: false;

        return answer;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution("(()))())"));
    }
}
