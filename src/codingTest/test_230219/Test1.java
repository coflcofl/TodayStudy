package codingTest.test_230219;

//프로그래머스 2 - 점프와 순간 이동
public class Test1 {
    public int solution(int n) {
        int ans = Integer.bitCount(n);

        return ans;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        System.out.println(t1.solution(5000));
    }
}
