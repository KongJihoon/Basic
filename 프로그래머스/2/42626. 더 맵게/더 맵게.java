import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {

        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {

            pq.offer(scoville[i]);

        }

        while (pq.peek() < K) {

            if (pq.size() == 1) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            pq.offer(first + (second * 2));

            count++;

        }

        return count;
    }
}