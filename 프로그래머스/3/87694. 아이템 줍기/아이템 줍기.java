import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    boolean[][] visited = new boolean[102][102];

    int[][] map = new int[102][102];

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0 , -1, 1};

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;


        for (int[] rect : rectangle) {

            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;


            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    map[i][j] = 1;
                }
            }
        }

        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int i = x1 + 1; i < x2; i++) {
                for (int j = y1 + 1; j < y2; j++) {
                    map[i][j] = 0;
                }
            }

        }


        return bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    }

    private int bfs(int startX, int startY, int itemX, int itemY) {

        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{startX, startY, 0});

        visited[startX][startY] = true;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            int x = cur[0];
            int y = cur[1];
            int distance = cur[2];

            if (x == itemX && y == itemY) {
                return distance / 2;
            }

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length) {
                    continue;
                }

                if (map[nx][ny] != 1) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;

                queue.offer(new int[]{nx, ny, distance + 1});


            }

        }

        return -1;
    }
}