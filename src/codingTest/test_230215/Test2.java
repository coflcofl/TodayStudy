package codingTest.test_230215;

public class Test2 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n;  j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }else if(sum > n) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();

        System.out.println(t2.solution(15));
    }
}
