class Solution {
    public int[] solution(int n, int m) {
        
        int gcd = getGcd(n, m);
        
        int lcm = n * m / gcd;
        


        return new int[]{gcd, lcm};
    }


    public int getGcd(int n, int m) {

        if (m == 0) {
            return n;
        }

        return getGcd(m, n % m);
    }
}