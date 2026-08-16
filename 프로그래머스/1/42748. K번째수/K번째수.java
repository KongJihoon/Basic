import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for (int index = 0; index < commands.length; index++) {

            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            List<Integer> list = new ArrayList<>();

            for (int l = i - 1; l <= j - 1; l++) {

                list.add(array[l]);

            }

            list.sort(Comparator.naturalOrder());

            answer[index] = list.get(k - 1);



        }



        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1,7, 3}};

        System.out.println(List.of(solution(array, commands)));
    }
}