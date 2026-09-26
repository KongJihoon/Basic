import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String value = String.valueOf(n);
        
        for (String num : value.split("")) {
            
            answer += Integer.parseInt(num);
        }


        return answer;
    }
}