import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);

        int walletMin = wallet[0];
        int billMin = bill[0];

        int walletMax = wallet[1];
        int billMax = bill[1];

        while (billMin > walletMin || billMax > walletMax) {

            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else if (bill[0] < bill[1]) {
                bill[1] /= 2;
            }
            
            answer++;

            billMax = Math.max(bill[0], bill[1]);
            billMin = Math.min(bill[0], bill[1]);

        }

        return answer;
    }
}