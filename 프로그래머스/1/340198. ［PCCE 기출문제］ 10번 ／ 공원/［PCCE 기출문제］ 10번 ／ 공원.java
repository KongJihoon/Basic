class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;

        int row = park.length;
        int col = park[0].length;

        int[][] dp = new int[row][col];

        int maxSquare = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (!park[i][j].equals("-1")) {
                    dp[i][j] = 0;
                    continue;
                }


                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {

                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;

                }

                maxSquare = Math.max(dp[i][j], maxSquare);

            }
        }

        answer = -1;

        for (int mat : mats) {

            if (mat <= maxSquare) {
                answer = Math.max(answer, mat);
            }

        }

        return answer;
    }
}