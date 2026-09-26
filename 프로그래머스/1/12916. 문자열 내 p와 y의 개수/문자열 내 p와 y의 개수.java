import java.util.HashMap;
import java.util.Map;

class Solution {
    boolean solution(String s) {

        String str = s.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;
        
        for (char c : str.toCharArray()) {
            
            if (c == 'p') {
                pCnt++;
            } else if (c == 'y') {
                yCnt++;
            }

        }
        
        
        if (pCnt != yCnt) {
            return false;
        }
        
        return true;
    }
}