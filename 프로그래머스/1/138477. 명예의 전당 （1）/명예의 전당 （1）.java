import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int k, int[] score) {


        int[] answer = new int[score.length];

        ArrayList<Integer> honor = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {

            honor.add(score[i]);
            
            honor.sort(Comparator.naturalOrder());
            

            if (honor.size() > k) {

                
                honor.remove(0);
            }
            
            answer[i] = honor.get(0);
            
            


        }

        return answer;
    }
}