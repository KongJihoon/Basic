import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for (int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")){
                if(board[0] / 2 == Math.abs(answer[0])){
                    if(answer[0] > 0){
                        answer[0] += -1;
                    }
                    continue;
                }
                answer[0] += -1;
            }
            if (keyinput[i].equals("right")) {
                if(board[0] / 2 == Math.abs(answer[0])){
                    if(answer[0] < 0){
                        answer[0] += 1;
                    }
                    continue;
                }
                answer[0] += 1;
            }
            if (keyinput[i].equals("up")) {
                if(board[1] / 2 == Math.abs(answer[1])){
                    if(answer[1] < 0){
                        answer[1] += 1;
                    }
                    continue;
                }
                answer[1] += 1;
            }
            if (keyinput[i].equals("down")) {
                if(board[1] / 2 == Math.abs(answer[1])){
                    if(answer[1] > 0){
                        answer[1] += -1;
                    }
                    continue;
                }
                answer[1] += -1;
            }
        }

        return answer;
    }
}