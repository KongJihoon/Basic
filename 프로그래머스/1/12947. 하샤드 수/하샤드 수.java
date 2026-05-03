class Solution {
    public boolean solution(int x) {

        int target = 0;

        String s = String.valueOf(x);
        
        for (String str : s.split("")) {
            
            target += Integer.parseInt(str);
        }

        
        if(x % target == 0) {
            return true;
        }

        return false;
    }
}