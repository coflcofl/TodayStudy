package codingTest.test_230215;

public class Test3 {
    public int solution(int n) {
        int answer = 0;
        int[] ansArr = new int[n];

        for(int i=0; i<n; i++) {
            if(i == 0) {
                ansArr[i] = 0;
            } else if(i == 1) {
                ansArr[i] = 1;
            } else {
                ansArr[i] = (ansArr[i-1] + ansArr[i-2])% 1234567;
            }
        }
        answer = (ansArr[n-1] + ansArr[n-2]) % 1234567;

        return answer;
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();

        System.out.println(t3.solution(12345));
    }
}
