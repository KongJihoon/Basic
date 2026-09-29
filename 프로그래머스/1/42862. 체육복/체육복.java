import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] students = new int[n];

        Arrays.fill(students, 1);

        for (int i : lost) {

            students[i - 1]--;
        }

        for (int i : reserve) {
            students[i - 1]++;
        }

        int count = 0;

        for (int i = 0; i < students.length; i++) {

            if (students[i] == 0) {
                
                if (i > 0 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]++;
                }

            }
            
            if (students[i] > 0) {
                count++;
            }


        }


        return count;
    }
}