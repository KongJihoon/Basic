import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int[][] reverse = new int[board[0].length][board.length];

        for (int i = 0; i < board.length; i++) {


            for (int j = 0; j < board[i].length; j++) {

                reverse[j][i] = board[i][j];

            }
        }


        for (int i = 0; i < moves.length; i++) {

            int line = moves[i] - 1;

            for (int j = 0; j < reverse[line].length; j++) {

                if (reverse[moves[i] - 1][j] == 0) {
                    continue;
                }

                if (!stack.isEmpty() && stack.peek() == reverse[line][j]) {
                    stack.pop();
                    answer += 2;

                } else {
                    stack.push(reverse[line][j]);

                }

                reverse[line][j] = 0;
                break;

            }

        }


        return answer;
    }
}