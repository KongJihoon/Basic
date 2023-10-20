class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && b != c && c != a){
            answer = a + b + c;
        } else if ((a == b && b != c) || (b==c && c != a) || (a == c && a!=b)) {
            answer = (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        } else if (a==b && a == c) {
            answer = (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }

        return answer;
    }
}