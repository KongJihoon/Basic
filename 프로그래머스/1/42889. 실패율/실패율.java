import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {

        // 처음 사용자 수 stages.length()
        // 1번 스테이지 실패율 저장 후 -> 사용자 수 stages.length() - 1번 스테이지에 머물러 있는 인원 수
        // 각 실패율 및 인덱스 저장 클래스 생성
        // 저장 후 실패율 높은 순으로 내림차순, 같을 경우 인덱스가 작은 순으로 오름차순

        List<Stage> list = new ArrayList<>();

        int len = stages.length;

        int[] count = new int[N + 2];

        for (int i = 0; i < stages.length; i++) {

            count[stages[i]]++;
        }

        for (int i = 1; i <= N; i++) {

            double failureRate;

            if (len == 0) {
                failureRate = 0;
            } else  {
                failureRate = (double) count[i] / len;
            }

            list.add(new Stage(i, failureRate));

            len -= count[i];

        }

        list.sort((f1, f2) -> {
            if (f1.failureRate == f2.failureRate) {
                return Integer.compare(f1.idx, f2.idx);
            }

            return Double.compare(f2.failureRate, f1.failureRate);
        });


        return list.stream()
                .mapToInt(Stage::getIdx)
                .toArray();

    }



    class Stage {

        private int idx;
        private double failureRate;


        public double getFailureRate() {
            return failureRate;
        }

        public int getIdx() {
            return idx;
        }


        public Stage(int idx, double failureRate) {
            this.idx = idx;
            this.failureRate = failureRate;
        }



    }
}