import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {

        int[] point = new int[3];

        int idx = 0;

        String value = "";

        for (char c : dartResult.toCharArray()) {

            if (Character.isDigit(c)) {
                value += c;
            }

            if (c == 'S') {
                point[idx] = (int)Math.pow(Integer.parseInt(value), 1);
                value = "";
                idx++;
            } else if (c == 'D') {
                point[idx] = (int)Math.pow(Integer.parseInt(value), 2);
                value = "";
                idx++;
            } else if (c == 'T') {
                point[idx] = (int)Math.pow(Integer.parseInt(value), 3);
                value = "";
                idx++;
            } else if (c == '*') {
                
                point[idx - 1] *= 2;
                
                if (idx >= 2) {
                    point[idx - 2] *= 2;
                }
                
            } else if (c == '#') {
                point[idx - 1] *= -1;
            }


        }


        return Arrays.stream(point)
                .sum();
    }
}