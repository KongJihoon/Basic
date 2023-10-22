import java.util.Stack;
class Solution{
    public String solution(String my_string) {
        String answer = "";
        Stack stack = new Stack();
        
        for(String s : my_string.split("")){
            stack.push(s);
        }
        while (!stack.isEmpty()){
            answer = answer + stack.pop();
        }
        return answer;
    }
}