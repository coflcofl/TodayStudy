package codingTest.test_221108;

public class Test4 {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");

        return answer;
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();

        System.out.println(t4.solution("abcdef","f"));
    }
}
