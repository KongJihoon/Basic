import java.util.PriorityQueue;

class Solution {
    boolean[] valid;

    public int[] solution(String[] operations) {
        int[] answer = {};

        PriorityQueue<Num> minQ = new PriorityQueue<>(
                (n1, n2) -> Integer.compare(n1.value, n2.value)
        );

        PriorityQueue<Num> maxQ = new PriorityQueue<>(
                (n1, n2) -> Integer.compare(n2.value, n1.value)
        );

        valid = new boolean[operations.length];

        int idx = 0;

        for (String operation : operations) {

            String[] split = operation.split(" ");

            String command = split[0];
            int value = Integer.parseInt(split[1]);


            if (command.equals("I")) {

                Num num = new Num(idx, value);

                minQ.offer(num);
                maxQ.offer(num);

                valid[idx] = true;
                idx++;

            } else {

                clean(minQ);
                clean(maxQ);

                if (value == 1) {
                    if (!maxQ.isEmpty()) {
                        Num num = maxQ.poll();
                        
                        valid[num.idx] = false;
                        
                    }
                } else {
                    
                    if (!minQ.isEmpty()) {
                        Num num = minQ.poll();
                        valid[num.idx] = false;
                    }
                    
                }
                

            }

        }
        
        clean(minQ);
        clean(maxQ);
        
        if (minQ.isEmpty()) {
            return new int[]{0, 0};
        }
        

        return new int[]{maxQ.peek().value, minQ.peek().value};
    }

    private void clean(PriorityQueue<Num> priorityQueue) {

        while (!priorityQueue.isEmpty() && !valid[priorityQueue.peek().idx]) {
            priorityQueue.poll();
        }

    }
}

class Num {

    int idx;
    int value;

    public Num(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }
}