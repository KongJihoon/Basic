import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (stack.isEmpty() && c == ')') {
                return false;
            }
            
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }

        }
        
        if (stack.isEmpty()) {
            return true;
        }


        return false;
    }
}