import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            
            int col = move - 1;

            for (int row = 0; row < board.length; row++) {
                
                if (board[row][col] == 0) {
                    continue;
                }
                
                int doll = board[row][col];
                
                if (!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    answer+=2;
                } else {
                    stack.push(doll);
                }
                
                
                board[row][col] = 0; 
                
                break;
                
            }
            
            
        }


        return answer;
    }
}