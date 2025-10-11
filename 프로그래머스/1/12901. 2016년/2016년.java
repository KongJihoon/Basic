class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int totalDay = 0;

        for (int i = 0; i < a - 1; i++) {
            
            totalDay += days[i];
        }
        
        totalDay += b;
        
        answer = dayOfWeek[((totalDay - 1) % 7)];


        return answer;
    }
}