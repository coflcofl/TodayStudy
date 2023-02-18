package codingTest.test_230215;

import java.util.Stack;

public class Test5 {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.size() > 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        Test5 t5 = new Test5();

        System.out.println(t5.solution("baabaa"));
    }
}
