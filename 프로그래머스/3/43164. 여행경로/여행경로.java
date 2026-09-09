import java.util.ArrayList;

class Solution {

    boolean[] visited;
    ArrayList<ArrayList<String>> result = new ArrayList<>();
    ArrayList<String> routes = new ArrayList<>();


    public String[] solution(String[][] tickets) {


        routes.add("ICN");

        visited = new boolean[tickets.length];

        dfs("ICN", 0, tickets);

        result.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i).compareTo(b.get(i));
                }
            }

            return 0;
        });

        return result.get(0).toArray(new String[0]);
    }

    private void dfs(String cur, int count, String[][] tickets) {

        if (count == tickets.length) {
            result.add(new ArrayList<>(routes));
            return;
        }

        for (int i = 0; i < tickets.length; i++) {

            if (visited[i]) {
                continue;
            }

            if (!tickets[i][0].equals(cur)) {
                continue;
            }

            visited[i] = true;
            routes.add(tickets[i][1]);

            dfs(tickets[i][1], count + 1, tickets);

            routes.remove(routes.size() - 1);
            visited[i] = false;


        }

    }
}