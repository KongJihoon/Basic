class Solution {
    public int solution(int[][] board) {
        int[][] boomBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1){
                    checkBoom(boomBoard, i , j);
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < boomBoard.length; i++) {
            for (int j = 0; j < boomBoard[i].length; j++) {
                if(boomBoard[i][j] == 0){
                    cnt++;
                }
            }
        }
        return cnt; 
    }


    public void checkBoom(int[][] boomBoard,int i, int j){
        int[] checkX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] checkY = {0, -1, 0, 1, -1, 1, -1, 0, 1};

        for (int k = 0; k < checkX.length; k++) {
           checkX[k] = i + checkX[k];
           checkY[k] = j + checkY[k];
           if(checkX[k] < boomBoard.length && checkY[k] <boomBoard.length){
               if(checkX[k] >= 0 && checkY[k] >= 0){
                   boomBoard[checkX[k]][checkY[k]] = 1;
               }
           }

        }

    }
}