import java.util.ArrayList;
import java.util.List;

class Solution {
    
    List<List<Integer>> graph;

    boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < wires.length; i++) {

            int wireA = wires[i][0];
            int wireB = wires[i][1];

            graph.get(wireA).add(wireB);
            graph.get(wireB).add(wireA);
        }


        for (int i = 0; i < wires.length; i++) {

            int cutA = wires[i][0];
            int cutB = wires[i][1];

            visited = new boolean[n + 1];

            int count = dfs(1, cutA, cutB);

            int other = n - count;

            int result = Math.abs(count - other);

            answer = Math.min(answer, result);

        }


        return answer;
    }

    private int dfs(int curr, int cutA, int cutB) {

        int count = 1;

        visited[curr] = true;

        for (int next : graph.get(curr)) {

            if ((curr == cutA && next == cutB) || (next == cutA && curr == cutB)) {
                continue;
            }

            if (!visited[next]) {
                count += dfs(next, cutA, cutB);
            }


        }


        return count;
    }
}