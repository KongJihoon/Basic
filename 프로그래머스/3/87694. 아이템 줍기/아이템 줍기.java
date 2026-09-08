import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    private final int[][] map = new int[102][102];
    private final boolean[][] visited = new boolean[102][102];

    private final int[] dx = {-1, 1, 0, 0};
    private final int[] dy = {0, 0, -1, 1};

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {


        for (int[] rect : rectangle) {

            /*
             * 직사각형 안을 모두 1로 채운다.
             * ㄷ자 경로에서 인접값이 존재하면 지름길 형성이 될 수 있으므로
             * 직사각형을 2배 키워서 좌표사이에 좌표를 생성해준다.
             */
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

            /*
             * 직사각형의 테두리만 탐색하므로 안쪽은 0으로 채운다
             * 각 직사각형의 안쪽을 채우므로 겹치는 부분은 0, 테두리는 1
             */

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

    private int bfs(int characterX, int characterY, int itemX, int itemY) {

        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{characterX, characterY, 0});

        visited[characterX][characterY] = true;

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

                if (nx < 0 || nx >= 102 || ny < 0 || ny >= 102) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (map[nx][ny] != 1) {
                    continue;
                }

                visited[nx][ny] = true;

                queue.offer(new int[]{nx, ny, distance + 1});

            }

        }

        return -1;
    }
}