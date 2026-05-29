import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Arrays.fill(answer, -1);

        for (int i = answer.length - 1; i >= 0; i--) {

            char itemA = s.charAt(i);

            for (int j = 0; j < i; j++) {
                
                char itemB = s.charAt(j);
                
                if (itemA == itemB) {
                    answer[i] = i - j;
                }
                
            }
            
            
            
        }


        return answer;
    }
}