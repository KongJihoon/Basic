import java.util.*;

public class Solution {
    public static int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                stack.add(arr[i]);
                continue;
            }

            if (stack.peek() == arr[i]) {
                continue;
            }

            list.add(stack.pop());

            stack.add(arr[i]);

        }

        if (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(Arrays.toString(solution(arr)));
    }
}