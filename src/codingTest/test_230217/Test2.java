package codingTest.test_230217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
        Arrays.sort(people);

        for(int i=people.length-1; idx <= i; i--) {
            if(people[i] + people[idx] <= limit) {
                idx++;
            }

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int[] i = {70, 80,50,50,50,50,50,50,50};

        System.out.println(t2.solution(i, 100));
    }
}
