import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        for (int i = progresses.length - 1; i >= 0; i--) {

            int remainDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);


            stack.push(remainDays);


        }


        while (!stack.isEmpty()) {

            int day = stack.pop();

            int cnt = 1;

            while (!stack.isEmpty() && stack.peek() <= day) {

                cnt++;
                stack.pop();
            }

            
            list.add(cnt);

        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}