package codingTest.test_221029;

class Test2 {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int median = num % 2 == 0 ? num / 2 - 1 : num / 2; //가운데 idx
        int center = total/num; //가운데 값

        answer = new int[num];
        answer[median] = center;

        for(int i=median+1; i<answer.length; i++) {
            answer[i] = answer[i-1] + 1;
        }

        for(int j=median-1; j>-1; j--) {
            answer[j] = answer[j+1] - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.solution(4, 14));
    }
}
