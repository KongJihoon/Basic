import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if(n % i == 0){
                list.add(i);
            }
        }
        list.add(n);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                
                if(list.get(i) * list.get(j) == n){
                    cnt++;
                }
                
                
            }
        }


        return answer = cnt;
    }
}