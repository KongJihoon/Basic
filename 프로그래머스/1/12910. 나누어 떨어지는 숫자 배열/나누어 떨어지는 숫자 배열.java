
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int item : arr) {

            if (item % divisor == 0) {
                list.add(item);
            }

        }


        if (list.isEmpty()) {
            list.add(-1);
            return list;
        }

        Collections.sort(list);

        return list;
    }

}
