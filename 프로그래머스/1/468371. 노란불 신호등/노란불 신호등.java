class Solution {
    public int solution(int[][] signals) {

        // 처음으로 신호등 종류의 종료 시점이 같은 지점을 찾아야한다.
        // 신호등이 3개라면 신호등이 처음으로 같이 끝나는 지점은 세 신호등의 최소공배수이다.

        int limit = 1;

        for (int i = 0; i < signals.length; i++) {

            int period = signals[i][0] + signals[i][1] + signals[i][2];

            limit = lcm(limit, period);

        }

        for (int i = 1; i <= limit; i++) {
            
            boolean allYellow = true;

            for (int j = 0; j < signals.length; j++) {

                int green = signals[j][0];
                int yellow = signals[j][1];
                int red = signals[j][2];
                
                int period = green + yellow + red;
                
                int curr = (i - 1) % period;
                
                boolean isYellow = curr >= green && curr < green + yellow;
                
                if (!isYellow) {
                    allYellow = false;
                    break;
                }
                
            }
            
            if (allYellow) {
                return i;
            }
        }


        return -1;
    }


    public int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {

        return  (a * b) / gcd(a, b);
    }
}