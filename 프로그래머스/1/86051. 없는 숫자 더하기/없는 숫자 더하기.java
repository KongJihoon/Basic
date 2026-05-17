import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < 10; i++) {
            
            boolean isFlag = false;

            for (int j = 0; j < numbers.length; j++) {
                
                if (numbers[j] == i) {
                    isFlag = true;
                    break;
                }
                
            }
            
            if (!isFlag) {
                answer += i;
            }
            
        }
        
        return answer;
    }
}