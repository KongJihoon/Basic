import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    boolean[][] visited;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0,-1, 1};

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

                int areaSize = bfs(m, n, i, j, picture);

                maxSizeOfOneArea = Math.max(areaSize, maxSizeOfOneArea);
                
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private int bfs(int m, int n, int startX, int startY, int[][] picture) {

        Queue<int[]> queue = new ArrayDeque<>();
        
        int color = picture[startX][startY];
        
        int count = 0;
        
        visited[startX][startY] = true;
        
        queue.offer(new int[]{startX, startY});
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            int x = cur[0];
            int y = cur[1];
            
            count++;

            for (int i = 0; i < 4; i++) {
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    continue;
                }
                
                if (picture[nx][ny] != color) {
                    continue;
                }
                
                if (visited[nx][ny]) {
                    continue;
                }
                
                visited[nx][ny] = true;
                
                queue.offer(new int[]{nx, ny});
                
                
            }
            
        }
        
        
        return count;
    }
}