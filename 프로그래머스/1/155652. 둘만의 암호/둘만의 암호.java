class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        boolean[] flag = new boolean[26];

        for (int i = 0; i < skip.length(); i++) {

            char target = skip.charAt(i);

            flag[target - 'a'] = true;

        }


        for (int i = 0; i < s.length(); i++) {

            char target = s.charAt(i);

            int targetIdx = target - 'a';

            int cnt = 0;

            while (cnt < index) {

                targetIdx = (targetIdx + 1) % 26;

                if (flag[targetIdx]) {
                    continue;
                }

                cnt++;

            }

            sb.append((char) ('a' + targetIdx));


        }


        return sb.toString();
    }
}