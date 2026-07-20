class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        int len = board.length;

        for (int i = 0; i < dh.length; i++) {

            int hIndex = h + dh[i];
            int wIndex = w + dw[i];

            if ((hIndex >= 0 && hIndex < len) && (wIndex >= 0 && wIndex < len)) {

                if (board[hIndex][wIndex].equals(board[h][w])) {
                    answer++;
                }
            }

        }




        return answer;
    }
}