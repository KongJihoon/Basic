import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = String.valueOf(numbers[i]);

        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        
        if (arr[0].equals("0")) {
            return "0";
        }

        for (String s : arr) {
            sb.append(s);
        }


        return sb.toString();
    }
}