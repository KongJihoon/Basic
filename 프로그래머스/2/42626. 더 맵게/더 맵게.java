import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        for (int i = 0; i < scoville.length; i++) {

            priorityQueue.add(scoville[i]);
        }

        while (priorityQueue.peek() < K) {
            
            if (priorityQueue.size() == 1) {
                return -1;
            }

            int minA = priorityQueue.remove();
            int minB = priorityQueue.remove();

            int shake = minA + (minB * 2);

            priorityQueue.add(shake);

            answer++;

        }

        return answer;
    }
}