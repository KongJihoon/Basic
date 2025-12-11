import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1) 자기 자신이 여벌을 가진 경우 처리
        boolean[] used = new boolean[reserve.length];

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] && !used[j]) {
                    used[j] = true;
                    lost[i] = -1; // lost에서 제거
                    answer++;
                    break;
                }
            }
        }

        // 2) 앞번호 → 뒤번호 순으로 빌리기
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue;

            for (int j = 0; j < reserve.length; j++) {
                if (!used[j] && (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1)) {
                    used[j] = true;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
