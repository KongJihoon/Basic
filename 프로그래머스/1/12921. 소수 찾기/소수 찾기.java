
class Solution {
    public int solution(int n) {
        int answer = 0;


        boolean[] prime = isPrime(n);

        for (int i = 0; i < prime.length; i++) {
            
            if (!prime[i]) {
                answer++;
            }
            
        }

        return answer;
    }


    public boolean[] isPrime(int n) {

        boolean[] prime = new boolean[n + 1];

        prime[0] = true;
        prime[1] = true;


        for (int i = 2; i <= Math.sqrt(n) ; i++) {

            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j+=i) {

                prime[j] = true;

            }

        }

        return prime;
    }
}