import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] sort = new int[rank.length];

        for (int i = 0; i < rank.length; i++) {
            if(attendance[i]){
                sort[i] = rank[i];
            }else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);
        int answer = 0;
        for (int i = 0; i < sort.length; i++) {
            if(rank[0] == sort[i]){
                answer += 10000 * i;
            } else if (rank[1] == sort[i]) {
                answer += 100 * i;
            } else if (rank[2] == sort[i]) {
                answer += i;
            }
        }
        return answer;
    }
}