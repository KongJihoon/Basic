import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {

        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());


        for (String operation : operations) {

            String[] split = operation.split(" ");

            String command = split[0];
            int value = Integer.parseInt(split[1]);

            if (command.equals("I")) {
                maxQ.offer(value);
                minQ.offer(value);
            } else {

                if (value == 1) {
                    
                    minQ.remove(maxQ.poll());
                    
                } else {
                    
                    maxQ.remove(minQ.poll());
                    
                }
            }

        }
        
        if (minQ.isEmpty()) {
            return new int[]{0, 0};
        }


        return new int[]{maxQ.peek(), minQ.peek()};
    }
}