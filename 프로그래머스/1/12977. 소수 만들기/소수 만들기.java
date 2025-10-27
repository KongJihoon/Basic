
class Solution {



    private static int cnt;

    public static int solution(int[] nums) {

        boolean[] visited = new boolean[nums.length];

        comb(nums, visited, 0, 3);

        return cnt;
    }

    public static void comb(int[] nums, boolean[] visited, int depth, int r) {

        if (r == 0) {

            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) {
                    sum += nums[i];
                }

            }

            if (isPrime(sum)) {
                cnt++;
            }
            
            return;


        }

        if (depth == nums.length) {
            return;
        }


        visited[depth] = true;
        comb(nums, visited, depth + 1, r - 1);

        visited[depth] = false;

        comb(nums, visited, depth + 1, r);

    }
    
    
    public static boolean isPrime(int n) {
        
        if (n <= 1) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        int[] nums = {1,2,7,6,4};

        int solution = solution(nums);

        System.out.println("solution = " + solution);


    }
}