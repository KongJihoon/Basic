import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n - lost.length;

        boolean[] isFlag = new boolean[31];

        for (int i = 0; i < lost.length; i++) {

            for (int j = 0; j < reserve.length; j++) {

                if(lost[i] == reserve[j]) {
                    isFlag[reserve[j]] = true;
                    answer++;
                    break;
                }

            }

        }


        for (int i = 0; i < lost.length; i++) {


            if (isFlag[lost[i]]) {
                continue;
            }

            for (int j = 0; j < reserve.length; j++) {


                if (reserve[j] == lost[i] + 1 || reserve[j] == lost[i] - 1) {

                    if (isFlag[reserve[j]]) {
                        continue;
                    }

                    answer++;

                    isFlag[reserve[j]] = true;

                    break;

                }

            }


        }




        return answer;
    }
}