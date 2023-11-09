class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int row = arr.length;
        int col = arr[0].length;
        if(row > col){
            int[][] load = arr.clone();
            answer = new int[row][row];
            for (int i = 0; i < load.length; i++) {
                for (int j = 0; j < load[i].length; j++) {
                    answer[i][j] = load[i][j];
                }
            }
        } else if (row < col) {
            int[][] load = arr.clone();
            answer = new int[col][col];
            for (int i = 0; i < load.length; i++) {
                for (int j = 0; j < load[i].length; j++) {
                    answer[i][j] = load[i][j];
                }
            }

        }else {
            answer = arr.clone();
        }


        return answer;
    }
}