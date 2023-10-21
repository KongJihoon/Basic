import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,-1);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int minValue = Integer.MAX_VALUE;
            for (int j = s; j <= e ; j++) {
                if(arr[j] > k && arr[j] < minValue){
                    minValue = arr[j];
                }
                if(minValue != Integer.MAX_VALUE){
                    answer[i] = minValue;
                }
            }



        }

        return answer;
    }
}