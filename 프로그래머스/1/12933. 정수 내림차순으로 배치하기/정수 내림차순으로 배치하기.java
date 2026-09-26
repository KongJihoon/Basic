import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr));



        return Long.parseLong(sb.reverse().toString());
    }
}