import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(list.size() == k){
                break;
            }
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        while (list.size() < k){
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}