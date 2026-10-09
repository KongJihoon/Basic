class Solution {
    public int solution(String[] babbling) {


        /*
         * "aya", "ye", "woo", "ma" 네가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못함.
         * 연속해서 같은 발음 불가
         */

        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {


            int previous = -1;

            int index = 0;

            while (index < word.length()) {

                boolean matched = false;
                

                for (int i = 0; i < words.length; i++) {

                    if(previous == i) {
                        continue;
                    }

                    if (word.startsWith(words[i], index)) {
                        index += words[i].length();
                        previous = i;
                        matched = true;
                        break;
                    }

                }

                if (!matched) {
                    break;
                }


            }

            if (index == word.length()) {
                answer++;
            }



        }

        return answer;
    }
}