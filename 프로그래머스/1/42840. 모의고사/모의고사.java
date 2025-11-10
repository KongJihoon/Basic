import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        

        int[][] patterns = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};

        int sumA = getScore(answers, patterns[0]);
        int sumB = getScore(answers, patterns[1]);
        int sumC = getScore(answers, patterns[2]);

        
        int max = Math.max(sumA, Math.max(sumB, sumC));
        
        int[] answer = {sumA, sumB, sumC};
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            
            if (answer[i] == max) {
                list.add(i + 1);
            } 
            
        }

        Collections.sort(list);

        return list;
    }
    
    
    public int getScore(int[] answers, int[] pattern) {

        int sum = 0;

        for (int i = 0; i < answers.length; i++) {
            
            if (answers[i] == pattern[i % pattern.length]) {
                sum++;
            }
            
        }
        
        
        return sum;
        
    }
}