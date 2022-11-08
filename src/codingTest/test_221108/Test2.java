package codingTest.test_221108;

public class Test2 {
    public int solution(int[] dot) {
        int answer = 0;

        answer = dot[0] > 0 && dot[1] > 0 ? 1 : answer; //1
        answer = dot[0] < 0 && dot[1] > 0 ? 2 : answer; //2
        answer = dot[0] < 0 && dot[1] < 0 ? 3 : answer; //3
        answer = dot[0] > 0 && dot[1] < 0 ? 4 : answer; //4

        return answer;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] data = {1, -4};
        System.out.println(test2.solution(data));
    }
}
