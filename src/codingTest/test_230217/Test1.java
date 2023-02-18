package codingTest.test_230217;

public class Test1 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int idx = 0;
        int sum = brown + yellow;

        for(int i=2; i<sum; i++) {
            if(sum%i == 0) {
                System.out.println(i);
            }
            idx ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution(10, 2));
    }
}
