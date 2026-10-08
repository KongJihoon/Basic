class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {

            int index = 0;
            int previous = -1;

            while (index < word.length()) {

                boolean matched = false;

                for (int i = 0; i < words.length; i++) {

                    if (previous == i) {
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