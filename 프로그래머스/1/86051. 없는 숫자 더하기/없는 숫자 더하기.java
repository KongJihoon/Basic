import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;


        boolean[] flag = new boolean[10];

        Arrays.sort(numbers);

        
        for (int i = 0; i < 10; i++) {

            if (flag[i]) {
                continue;
            }
            
            for (int j = 0; j < numbers.length; j++) {
                
                if (numbers[j] == i) {
                    flag[i] = true;
                    break;
                }
                
            }

        }

        for (int i = 0; i < flag.length; i++) {

            if (!flag[i]) {
                answer += i;
            }

        }


        return answer;
    }
}