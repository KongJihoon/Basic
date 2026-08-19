import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] pickA = {1,2,3,4,5};
        int[] pickB = {2,1,2,3,2,4,2,5};
        int[] pickC = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int scoreA = getScore(answers, pickA);
        int scoreB = getScore(answers, pickB);
        int scoreC = getScore(answers, pickC);

        int maxScore = Math.max(scoreA, Math.max(scoreB, scoreC));

        List<Integer> list = new ArrayList<>();
        
        if (scoreA == maxScore) list.add(1);
        
        if (scoreB == maxScore) list.add(2);
        
        if (scoreC == maxScore) list.add(3);
        
        

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int getScore(int[] answers, int[] pick) {
    
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            
            if (answers[i] == pick[i % pick.length]) {
                score++;
            }
            
        }
    
        return score;
    }
}