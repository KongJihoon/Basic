import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {



        int[][] pick = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] score = new int[pick.length];

        for (int i = 0; i < answers.length; i++) {

            for (int j = 0; j < pick.length; j++) {

                if (answers[i] == pick[j][i % pick[j].length]) {
                    score[j]++;
                }

            }

        }

        int max = Arrays.stream(score)
                .max()
                .getAsInt();
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            
            if (score[i] == max) {
                list.add(i + 1);
            }
            
        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}