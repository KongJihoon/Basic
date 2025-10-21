import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length == 1) {
            result.add(-1);
            return result;
        }

        int min = Integer.MAX_VALUE;

        for (int item : arr) {

            if (min > item) {
                min = item;
            }

        }
        
        
        

        for (int item : arr) {

            if (item == min) {
                continue;
            }


            result.add(item);
        }

        return result;
    }
}