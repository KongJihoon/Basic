class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tmpA = Integer.toString(a);
        String tmpB = Integer.toString(b);
        if(Integer.parseInt(tmpA+tmpB) > Integer.parseInt(tmpB+tmpA)){
            answer = Integer.parseInt(tmpA+tmpB);
        }else {
            answer = Integer.parseInt(tmpB+tmpA);
        }
            
        return answer;
    }
}