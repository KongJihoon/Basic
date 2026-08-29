import java.util.ArrayList;
import java.util.List;

class Solution {

    boolean[] visited;

    List<List<Integer>> graph;

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

        for (int[] wire : wires) {

            int cutA = wire[0];
            int cutB = wire[1];

            visited = new boolean[n + 1];

            int count = dfs(1, cutA, cutB);

            int other = n - count;

            int diff = Math.abs(count - other);


            answer = Math.min(answer, diff);

        }


        return answer;
    }

    private int dfs(int curr, int cutA, int cutB) {

        int count = 1;

        visited[curr] = true;

        for (int next : graph.get(curr)) {

            if ((curr == cutA &&  next == cutB) || (curr == cutB && next == cutA)) {
                continue;
            }
            
            if (!visited[next]) {
                count += dfs(next, cutA, cutB);
            }

        }


        return count;
    }
}