import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {


        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {

            int col = move - 1;

            for (int row = 0; row < board.length; row++) {

                int value = board[row][col];

                if (value == 0) {
                    continue;
                }
                
                board[row][col] = 0;
                
                if (!stack.isEmpty() && stack.peek() == value) {
                    stack.pop();
                    count += 2;
                } else {
                    stack.push(value);
                }


                break;

            }

        }


        return count;
    }
}