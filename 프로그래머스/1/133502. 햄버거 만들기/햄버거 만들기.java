import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {

        // 빵 야채 고기 빵 순서로 포장 가능
        // 포장하는 동안 속 재료가 추가적으로 들어오는 경우는 x
        // 재료의 높이는 무시
        // 재료의 순서가 정해진 배열 ingredient가 주어졌을때
        // 1,2,3,1 순서가 있으면 카운팅
        

        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        
        for (int item : ingredient) {
            
            stack.push(item);
            
            if (stack.size() >= 4) {
                
                int size = stack.size();
                
                if (stack.get(size - 1) == 1
                && stack.get(size - 2) == 3
                && stack.get(size - 3) == 2
                && stack.get(size - 4) == 1) {

                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();

                    answer++;
                }
                
            }
            
            
        }
        
        
        return answer;
    }
}