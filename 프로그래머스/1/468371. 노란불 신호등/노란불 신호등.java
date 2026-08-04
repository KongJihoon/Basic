class Solution {
    public int solution(int[][] signals) {
        int answer = 0;


        int limit = 1;

        for (int i = 0; i < signals.length; i++) {

            int green = signals[i][0];
            int yellow = signals[i][1];
            int red = signals[i][2];

            limit = lcm(limit, green + yellow + red);
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



    private int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }


        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {

        return a * b / gcd(a,b);
    }
}