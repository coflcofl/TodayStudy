package codingTest.test_221029;

import java.util.*;

class Test1 {
    public int solution(int[] common) {
        int answer = 0;
        String solution = "";
        List<Integer> d = new ArrayList<>();

        for(int i=0; i<common.length; i++) {
            if(i + 1 != common.length) {
                d.add(common[i+1] - common[i]);
                System.out.println(d);
            }
        }

        for(int a=0; a<d.size(); a++) {
            if(a + 1 != d.size()) {
                solution = d.get(a+1).equals(d.get(a)) ? "S" : "R";
            }
        }

        answer = "S".equals(solution) ? common[common.length-1] + d.get(d.size()-1) : common[common.length-1] * (d.get(1) / d.get(0));

        return answer;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int[] data = {1, 2, 4, 8};

        System.out.println(test1.solution(data));
    }
}
