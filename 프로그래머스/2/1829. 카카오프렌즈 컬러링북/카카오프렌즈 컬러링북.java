import java.util.ArrayDeque;
import java.util.Queue;

class Solution {


    boolean[][] visited;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;


        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {


                if (picture[i][j] == 0) {
                    continue;
                }

                if (visited[i][j]) {
                    continue;
                }

                numberOfArea++;

                int ariaSize = bfs(i, j, picture,m,n);

                maxSizeOfOneArea = Math.max(ariaSize, maxSizeOfOneArea);

            }
        }


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;



        return answer;
    }

    private int bfs(int startX, int startY, int[][] picture, int m, int n) {

        int color = picture[startX][startY];

        visited[startX][startY] = true;

        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{startX, startY});

        int count = 0;


        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            int x = cur[0];
            int y = cur[1];

            count++;


            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위를 벗어 나는 경우
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    continue;
                }

                // 이미 방문한 경우
                if (visited[nx][ny]) {
                    continue;
                }

                // 같은 색깔이 아닌경우
                if (color != picture[nx][ny]) {
                    continue;
                }



                visited[nx][ny] = true;

                queue.offer(new int[]{nx, ny});



            }

        }

        return count;
    }
}