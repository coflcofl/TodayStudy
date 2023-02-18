package codingTest.test_230216;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        int idx = 0;
        List<String> lWords = new ArrayList<>();

        for(int i=1; i<words.length; i++) {
            if(!words[i-1].endsWith(words[i].substring(0, 1))) {
                idx = i;
                break;
            }

            if(lWords.contains(words[i])) {
                idx = i;
                break;
            } else {
                lWords.add(words[i-1]);
            }
        }
        int seq = idx == 0 ? idx : idx%n+1;
        int out = idx == 0 ? idx : idx/n+1;

        answer = new int[]{seq, out};

        return answer;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        String[] w = {
                //"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
                "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"
                //"hello", "one", "even", "never", "now", "world", "draw"
        };
        System.out.println(t1.solution(3, w));
    }
}
