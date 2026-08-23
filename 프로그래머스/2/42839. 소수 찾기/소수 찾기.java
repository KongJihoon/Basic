import java.util.HashSet;
import java.util.Set;

class Solution {

    Set<Integer> set = new HashSet<>();

    boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;

        visited = new boolean[numbers.length()];

        dfs("", numbers);

        for (int num : set) {

            if (isPrime(num)) {
                answer++;
            }

        }


        return answer;
    }

    private void dfs(String current, String numbers) {

        for (int i = 0; i < numbers.length(); i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            
            String next = current + numbers.charAt(i);

            set.add(Integer.parseInt(next));

            dfs(next, numbers);

            visited[i] = false;

        }


    }

    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }
}