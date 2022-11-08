package codingTest.test_221108;

import java.util.Arrays;

public class Test3 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        for(int i=0; i<num2-num1+1; i++) {
            answer[i] = numbers[num1+i];
        }

        for(int i : answer) {
            System.out.println(i);
        }

        return answer;
        //풀이 : return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        int[] i = {1, 3, 5};

        System.out.println(t3.solution(i,1,2));
    }
}
