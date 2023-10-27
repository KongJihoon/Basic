import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i >= end_num ; i--) {
            list.add(i);
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}