class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp = Integer.toString(a) + Integer.toString(b);
        int tmp2 = 2 * a * b;
        if(Integer.parseInt(tmp) > tmp2){
            answer = Integer.parseInt(tmp);
        }else {
            answer = tmp2;
        }
        return answer;
    }
}