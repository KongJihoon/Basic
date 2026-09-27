class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String num = String.valueOf(x);
        
        int sum = 0;
        
        for (String s : num.split("")) {
            
            sum += Integer.parseInt(s);
            
        }
        
        if (x % sum == 0) {
            return true;
        }
        
        return false;
    }
}