class Solution {
    public String solution(int n) {

        
        int[] numbers = {1, 2, 4};
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            n--;
            
            sb.append(numbers[n % 3]);
            
            
            n /= 3;
            
        }
        
        return sb.reverse().toString();
    }
}