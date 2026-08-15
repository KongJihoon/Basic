import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {

            queue.offer(0);
        }

        int time = 0;

        int currWeight = 0;

        int index = 0;

        while (index < truck_weights.length) {

            time++;


            currWeight -= queue.poll();

            if (currWeight + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                currWeight += truck_weights[index];
                index++;
            } else {
                queue.offer(0);
            }

        }

        return time + bridge_length;
    }
}