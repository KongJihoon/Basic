import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i <= num_list.length - 1 ; i++) {
            list.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}