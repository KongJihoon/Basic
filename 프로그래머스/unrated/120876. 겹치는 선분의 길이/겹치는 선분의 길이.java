class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] a = new int[200];
        for(int[] item : lines){
            for (int j = (item[0] + 100); j < (item[1] + 100); j++) {
                a[j]++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 1){
                answer ++;
            }
        }

        return answer;
    }
}