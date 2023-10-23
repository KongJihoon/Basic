class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheepPrice = 12000;
        int beverage = 2000;
        int cnt = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 10 == 0){
                cnt++;
            }
        }
        if(n >= 10){
            answer = sheepPrice * n + beverage * (k - cnt);
        }else {
            answer = sheepPrice * n + beverage * k;
        }
        return answer;
    }
}