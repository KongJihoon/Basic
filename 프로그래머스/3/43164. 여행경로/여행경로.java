import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    boolean[] visited;
    ArrayList<String> routes = new ArrayList<>();


    public String[] solution(String[][] tickets) {

        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            }

            return a[0].compareTo(b[0]);
        });

        routes.add("ICN");

        visited = new boolean[tickets.length];

        dfs("ICN", 0, tickets);

        return routes.toArray(new String[0]);
    }

    private boolean dfs(String cur, int count, String[][] tickets) {

        if (count == tickets.length) {

            return true;
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

            if (dfs(tickets[i][1], count + 1, tickets)) {
                return true;
            }

            routes.remove(routes.size() - 1);
            visited[i] = false;


        }

        return false;
    }
}