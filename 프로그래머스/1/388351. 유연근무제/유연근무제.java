class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;


        for (int i = 0; i < timelogs.length; i++) {

            boolean isGifted = true;

            int deadline = toMinutes(schedules[i]) + 10;
            
            int day = startday;

            for (int j = 0; j < timelogs[i].length; j++) {

                if (day != 6 && day != 7) {
                    
                    int arrivalTime = toMinutes(timelogs[i][j]);
                    
                    if (arrivalTime > deadline) {
                        isGifted = false;
                        break;
                    }
                    
                }
                
                day = day % 7 + 1;

            }
            
            if (isGifted) {
                answer++;
            }

        }
        
        return answer;
    }

    private int toMinutes(int startday) {

        int hour = startday / 100;

        int minutes = startday % 100;

        return hour * 60 + minutes;
    }
}