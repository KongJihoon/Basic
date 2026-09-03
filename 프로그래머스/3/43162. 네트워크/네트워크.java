class Solution {

    private static boolean[] visited;

    public static int solution(int n, int[][] computers) {

        int count = 0;

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {


            if (!visited[i]) {
                dfs(i, computers);
                count++;
            }
        }


        return count;
    }

    private static void dfs(int cur, int[][] computers) {

        visited[cur] = true;

        for (int i = 0; i < computers.length; i++) {

            if (computers[cur][i] == 1 && !visited[i]) {

                dfs(i, computers);
            }

        }
    }

    public static void main(String[] args) {
        int n = 3;

        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};

        System.out.println(solution(n, computers));
    }
}