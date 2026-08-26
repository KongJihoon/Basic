import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    class Disk implements Comparable<Disk>{

        int idx;
        int use;
        int req;

        public Disk(int idx, int use, int req) {
            this.idx = idx;
            this.use = use;
            this.req = req;
        }

        @Override
        public int compareTo(Disk o) {

            if (this.use != o.use) {
                return this.use - o.use;
            }

            if (req != o.req) {
                return this.req - o.req;
            }


            return this.idx - o.idx;
        }
    }

    public int solution(int[][] jobs) {

        int n = jobs.length;

        Disk[] disks = new Disk[n];

        for (int i = 0; i < jobs.length; i++) {

            disks[i] = new Disk(i, jobs[i][1], jobs[i][0]);
        }

        Arrays.sort(disks, (d1, d2) -> {
            if (d1.req != d2.req) {
                return d1.req - d2.req;
            }

            return d1.idx - d2.idx;
        });

        PriorityQueue<Disk> pq = new PriorityQueue<>();


        int sum = 0;

        int time = 0;

        int idx = 0;

        while (idx < n || !pq.isEmpty()) {

            while (idx < n && disks[idx].req <= time) {
                pq.offer(disks[idx]);
                idx++;
            }

            if (!pq.isEmpty()) {

                Disk cur = pq.poll();

                time += cur.use;

                sum += time - cur.req;

            } else {

                time = disks[idx].req;

            }

        }


        return sum / n;
    }
}