class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        boolean[] flag = new boolean[26];

        for (int i = 0; i < skip.length(); i++) {

            char c = skip.charAt(i);

            flag[c - 'a'] = true;

        }


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            int idx = c - 'a';
            int cnt = 0;

            while (cnt < index) {


                idx = (idx + 1) % 26;

                if (flag[idx]) {
                    continue;
                }

                cnt++;

            }

            sb.append((char) (idx + 'a'));

        }


        return sb.toString();
    }
}