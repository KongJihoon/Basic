import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        int[] count = new int[N + 2];

        List<Stage> list = new ArrayList<>();

        for (int stage : stages) {
            count[stage]++;
        }

        int users = stages.length;

        for (int i = 1; i <= N; i++) {

            double failureRate;

            if (users == 0) {
                failureRate = 0;
            } else {
                failureRate = (double) count[i] / users;
            }

            list.add(new Stage(i, failureRate));

            users -= count[i];

        }

        list.sort((f1, f2) -> {

            if (Double.compare(f1.failureRate, f2.failureRate) == 0) {
                return Integer.compare(f1.number, f2.number);
            }

            return Double.compare(f2.failureRate, f1.failureRate);
        });

        answer = new int[N];

        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i).number;

        }

        return answer;
    }



    class Stage {

        int number = 0;
        double failureRate;

        public Stage(int number, double failureRate) {

            this.number = number;
            this.failureRate = failureRate;
        }


    }

}