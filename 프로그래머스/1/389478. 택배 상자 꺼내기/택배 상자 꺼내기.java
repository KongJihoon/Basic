class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;

        int height = (n + w - 1) / w;

        int[][] boxes = new int[height][w];

        for (int i = 1; i <= n; i++) {

            int row = (i - 1) / w;
            int index = (i - 1) % w;

            int col;

            if (row % 2 == 0) {
                col = index;
            } else {
                col = w - 1 - index;
            }

            boxes[row][col] = i;

        }

        int targetRow = 0;
        int targetCol = 0;

        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {

                if (boxes[i][j] == num) {
                    targetRow = i;
                    targetCol = j;
                }

            }
        }


        for (int i = targetRow; i < height; i++) {

            if (boxes[i][targetCol] != 0) {
                answer++;
            }

        }


        return answer;
    }
}