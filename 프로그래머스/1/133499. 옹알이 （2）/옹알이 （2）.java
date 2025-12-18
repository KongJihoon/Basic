class Solution {
    public int solution(String[] babbling) {
        int answer = 0;


        String[] check = { "aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {

            String word = babbling[i];
            int idx = 0;
            boolean ok = true;
            String prev = "";

            while (idx < babbling[i].length()) {

                boolean matched = false;

                for (int j = 0; j < check.length; j++) {

                    String s = check[j];

                    if (word.startsWith(s, idx)) {

                        if (prev.equals(s)) {
                            ok = false;
                            break;
                        }

                        idx += s.length();
                        prev = s;
                        matched = true;

                        break;

                    }


                }

                if (!ok) {
                    break;
                }

                if (!matched) {
                    break;
                }


            }

            if (ok && idx == word.length()) {
                answer++;
            }


        }

        return answer;
    }
}