import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {


        int count = 0;

        Queue<Priority> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {

            queue.offer(new Priority(i, priorities[i]));

        }

        List<Integer> list = new ArrayList<>();

        for (int priority : priorities) {
            list.add(priority);
        }

        list.sort((a, b) -> b - a);

        int idx = 0;

        while (!queue.isEmpty()) {

            Priority priority = queue.poll();

            if (priority.value == list.get(idx)) {
                count++;
                if (priority.index == location) {
                    return count;
                }

                idx++;
            } else {
                queue.offer(priority);
            }


        }




        return count;
    }
    
    class Priority {
        int index;
        int value;
        
        public Priority(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}