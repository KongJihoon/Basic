import java.util.Arrays;
import java.util.List;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        boolean[] used = new boolean[reserve.length];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        
        // 잃어버렸지만 여벌옷을 챙겨온 인원 체크
        for (int i = 0; i < lost.length; i++) {

            for (int j = 0; j < reserve.length; j++) {
                
                if (lost[i] == reserve[j]) {
                    
                    lost[i] = -1;
                    used[j] = true;
                    answer++;
                    break;
                }
            
            }
            
        }

        for (int i = 0; i < lost.length; i++) {
            
            if (lost[i] == -1) {
                continue;
            }

            for (int j = 0; j < reserve.length; j++) {
                
                
                if (!used[j] && (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j])) {
                    
                    used[j] = true;
                    answer++;
                    break;

                    
                }
                
            }
            
        }
        
        
        
        
        return answer;
    }
}