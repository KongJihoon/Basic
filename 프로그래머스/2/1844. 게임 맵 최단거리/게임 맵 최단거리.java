import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        visited[0][0] = true;
        queue.offer(new int[]{0,0,1});

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            int row = cur[0];
            int col = cur[1];
            int distance = cur[2];

            if (row == n - 1 && col == m - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {

                int nx = row + dx[i];
                int ny = col + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                queue.offer(new int[]{nx, ny, distance + 1});
                visited[nx][ny] = true;

            }

        }


        return -1;
    }
}