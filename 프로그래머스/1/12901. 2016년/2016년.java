import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {


        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;

        for (int i = 1; i < a; i++) {
            
            day += days[i];
            
        }
        
        day += b;
        
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        String answer = week[(day - 1) % 7];
        
        return answer;
    }
}