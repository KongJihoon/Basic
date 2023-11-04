import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                i += 1;
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == arr[i]){
                stack.pop();
                i += 1;
                continue;
            }
            if(!stack.isEmpty() && stack.peek() != arr[i]){
                stack.push(arr[i]);
                i += 1;
                continue;
            }
        }
        if (stack.isEmpty()){
            stack.push(-1);
        }
        

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}