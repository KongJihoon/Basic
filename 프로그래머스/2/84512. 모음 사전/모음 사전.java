import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> list = new ArrayList<>();
    char[] chars = {'A', 'E', 'I', 'O', 'U'};


    public int solution(String word) {
        int answer = 0;

        dfs("");

        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i).equals(word)) {
                answer = i + 1;
            }
            
        }

        return answer;
    }

    private void dfs(String current) {

        if (current.length() == 5) {
            return;
        }

        for (char c : chars) {

            String next = current + c;

            list.add(next);

            dfs(next);

        }



    }
}