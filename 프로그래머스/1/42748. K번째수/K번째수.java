import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {

            int[] arr = getArr(array, commands[i][0], commands[i][1]);
            
            answer[i] = arr[commands[i][2] - 1];

        }
        
        return answer;
    }
    
    
    
    public int[] getArr(int[] arr, int i, int j) {
        
        int[] result = new int[j - i + 1];

        int idx = 0;
        for (int k = i - 1; k < j; k++) {
            result[idx++] = arr[k];   
        }

        Arrays.sort(result);
        
        
        return result;
    }
    
}