package codingTest.test_221030;

import java.util.*;

public class Test1 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i=0; i<num_list.length; i++) {
            answer[num_list.length - i -1] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int[] data = {5,4,3,2,1};
        System.out.println(test1.solution(data));
    }
}
