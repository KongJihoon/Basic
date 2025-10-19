class Solution {
    public String solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        
        
        while (n-- > 0) {
            
            
            if (cnt % 2 == 0) {
                
                sb.append("박");
                
            } else {
                sb.append("수");
               
            }
            
            cnt++;
            
            
            
            
        }
        
        return sb.toString();
    }
}