class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        /**
         * aya, ye, woo, ma 단어로만 조합가능
         * 예시 ayaye 단어가 주어질 때 생성한 발음 배열로 시작하는지 판별
         * 만약 발견되면 subString으로 문자열을 줄인다.
         * boolean possible 및 found로 플래그를 걸어 아예 없을 경우 빠르게 while문 break
         */


        String[] words = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {

            boolean possible = true;

            String prev = "";

            while (!s.isEmpty()) {

                boolean found = false;

                for (String word : words) {


                    if (s.startsWith(word) && !prev.equals(word)) {
                        
                        s = s.substring(word.length());
                        
                        prev = word;
                        
                        found = true;
                        
                        break;

                        
                    }

                }
                
                if (!found) {
                    possible = false;
                    break;
                }


            }


            if (possible) {
                answer++;
            }


        }



        return answer;
    }
}