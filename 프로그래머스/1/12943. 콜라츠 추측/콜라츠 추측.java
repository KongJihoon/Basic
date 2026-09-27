class Solution {
    public int solution(int num) {

        if (num == 1) {
            return 0;
        }

        int cnt = 0;
        
        long n = num;

        while (true) {


            if (cnt == 500) {
                return -1;
            }

            if (n == 1) {
                break;
            }
            
            cnt++;


            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;

            }


        }


        return cnt;
    }
}