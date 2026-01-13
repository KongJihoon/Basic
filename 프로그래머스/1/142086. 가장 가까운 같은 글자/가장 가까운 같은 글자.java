
import java.util.*;
class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastIndex = new int[26];

        Arrays.fill(lastIndex, -1);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            int idx = c - 'a';

            if (lastIndex[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex[idx];
            }

            lastIndex[idx] = i;
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "banana";

        System.out.println(Arrays.toString(solution(s)));

    }
}