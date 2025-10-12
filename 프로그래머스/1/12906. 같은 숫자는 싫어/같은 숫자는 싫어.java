import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        Stack<Integer> result = new Stack<>();


        for (int item : arr) {

            if (stack.isEmpty()) {
                stack.push(item);
                continue;
            } else if (stack.peek() == item) {
                continue;
            }

            stack.push(item);

        }

        answer = new int[stack.size()];


        for (int i = 0; i < answer.length; i++) {

            result.push(stack.pop());
        }


        for (int i = 0; i < answer.length; i++) {

            answer[i] = result.pop();
        }


        return answer;
    }

}
