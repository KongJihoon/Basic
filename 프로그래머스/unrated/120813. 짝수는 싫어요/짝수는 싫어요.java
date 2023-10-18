import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n % 2 == 0) {
            answer = new int[n/2];
        }else{
            answer = new int[(n/2)+1] ;
        }
        int num = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                answer[num] = i;
                num++;
            }

        }
        Arrays.sort(answer);
        return answer;
    }
}