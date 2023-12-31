import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            }else if(list.get(list.size() - 1) >= arr[i]){
                list.remove(list.size() - 1);
            }
        }
        int[] stk = new int[list.size()];
        for (int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}