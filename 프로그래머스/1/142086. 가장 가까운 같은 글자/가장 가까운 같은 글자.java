class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];


        for (int i = 0; i < s.length(); i++) {

            boolean flag = false;

            char c = s.charAt(i);

            for (int j = i - 1; j >= 0; j--) {

                if (c == s.charAt(j)) {
                    flag = true;
                    answer[i] = i - j;
                    break;
                }

            }

            if (!flag) {
                answer[i] = -1;
            }

        }

        return answer;
    }
}