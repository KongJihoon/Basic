import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        
        
        // 최댓값 중 가장 큰 값과 최소값 중 가장 큰 값을 이용
        // 위 두값을 이용하면 모든 명함을 넣을 수 있는 가장 작은 지갑
        int len = sizes.length;
        
        int[] maxSize = new int[len];
        int[] minSize = new int[len];
        

        for (int i = 0; i < len; i++) {
            
            maxSize[i] = Math.max(sizes[i][0], sizes[i][1]);
            minSize[i] = Math.min(sizes[i][0], sizes[i][1]);
            
        }

        Arrays.sort(maxSize);
        Arrays.sort(minSize);
        
        // 오름차순 정렬 후 가장 큰 값의 곱을 리턴
        answer = maxSize[len - 1] * minSize[len - 1];
        
        return answer;
    }
}