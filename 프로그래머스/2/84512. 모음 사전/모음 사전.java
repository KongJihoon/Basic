import java.util.ArrayList;
import java.util.List;

class Solution {

    char[] words = {'A', 'E', 'I', 'O', 'U'};

    List<String> list = new ArrayList<>();

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


    public void dfs(String curr) {

        if (curr.length() == 5) {
            return;
        }

        for (char word : words) {

            String next = curr + word;

            list.add(next);

            dfs(next);

        }

    }
}