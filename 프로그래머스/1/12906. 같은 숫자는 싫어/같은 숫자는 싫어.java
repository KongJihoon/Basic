import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] != stack.peek()) {
                
                result.add(stack.pop());
                
                stack.push(arr[i]);
            }
            
        }
        
        if (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}