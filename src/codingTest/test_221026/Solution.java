package codingTest.test_221026;

enum Pronounciation {
    aya, ye, woo, ma
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Pronounciation[] pronounciation = Pronounciation.values();

        for(String bab : babbling) {

            for(Pronounciation pro : pronounciation) {
                bab = bab.contains(pro.name()) ? bab.replace(pro.name(), "*") : bab;
            }
            answer = bab.equals("*") ? answer + 1 : answer;
            answer = bab.equals("**") ? answer + 1 : answer;
            answer = bab.equals("***") ? answer + 1 : answer;
            answer = bab.equals("****") ? answer + 1 : answer;

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] bab = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(solution.solution(bab));
    }
}
