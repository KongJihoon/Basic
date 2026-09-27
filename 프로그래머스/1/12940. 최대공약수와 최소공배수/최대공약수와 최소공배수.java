class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(n, m);
        
        int lcm = (n * m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }


    public int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a% b);
    }
}