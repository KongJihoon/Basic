import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {


        int count = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {

            queue.offer(new int[]{i, priorities[i]});

        }

        List<Integer> list = new ArrayList<>();

        for (int priority : priorities) {
            list.add(priority);
        }

        list.sort((a, b) -> b - a);

        int idx = 0;

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            if (curr[1] == list.get(idx)) {
                count++;
                if (curr[0] == location) {
                    return count;
                }
                
                idx++;
            } else {
                queue.offer(curr);
            }


        }




        return count;
    }
}