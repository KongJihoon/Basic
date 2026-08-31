class Solution {

    private static int count;

    public static int solution(int[] numbers, int target) {

        dfs(0, 0, numbers, target);

        return count;
    }


    public static void dfs(int flag, int sum, int[] numbers, int target) {

        if (flag == numbers.length) {
            if (target == sum) {
                count++;
            }
            return;
        }


        dfs(flag + 1, sum + numbers[flag], numbers, target);
        dfs(flag + 1, sum - numbers[flag], numbers, target);

    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};

        int target = 4;

        System.out.println(solution(numbers, target));
    }
}