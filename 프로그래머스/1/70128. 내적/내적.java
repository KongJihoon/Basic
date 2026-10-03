class Solution {
    public int solution(int[] a, int[] b) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            
            int x = a[i];
            int y = b[i];
            
            sum += x * y;
            
        }
        
        return sum
                ;
    }
}