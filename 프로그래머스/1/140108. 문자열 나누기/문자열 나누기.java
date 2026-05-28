class Solution {
    public int solution(String s) {
        int answer = 0;

        int xCnt = 0;

        int yCnt = 0;

        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {

            char y = s.charAt(i);

            if (x == y) {
                xCnt++;
            } else {
                yCnt++;
            }

            if (xCnt == yCnt) {
                answer++;
                
                if (i + 1 < s.length()) {
                    
                    x = s.charAt(i + 1);
                    xCnt = 0;
                    yCnt = 0;
                    
                }
                
                
            }


        }
        
        if (xCnt != yCnt) {
            answer++;
        }



        return answer;
    }
}