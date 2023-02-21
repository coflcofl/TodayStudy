package codingTest.test_230219;

//프로그래머스 2 - 멀리 뛰기
public class Test2 {
    public long solution(int n) {
        long answer = 0;
        long a = 0;
        long b = 0;

        for(int i=1; i<=n; i++) {
            if(i < 3) {
                answer = i;
                a = i-1;
                b = i;
            } else {
                answer = a + b;

                a = b;
                b = answer;
            }
        }

        return answer%1234567;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        System.out.println(t2.solution(2));
    }
}
