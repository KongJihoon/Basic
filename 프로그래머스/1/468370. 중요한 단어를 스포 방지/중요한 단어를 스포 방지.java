import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;

        // 스포일러 구간 문자 담을 배열 생성
        // 두 단어가 스포일러 방지 구간에 걸쳐있을 수 있다.
        List<List<String>> spoilerWords = new ArrayList<>();

        for (int i = 0; i < spoiler_ranges.length; i++) {

            spoilerWords.add(new ArrayList<>());
        }

        Set<String> normalWords = new HashSet<>();

        int index = 0;

        while (index < message.length()) {

            int startIndex = index;

            while (index < message.length() && message.charAt(index) != ' ') {
                index++;
            }

            int endIndex = index - 1;

            boolean isSpoiler = false;

            String word = message.substring(startIndex, index);

            for (int i = 0; i < spoiler_ranges.length; i++) {

                int spoilerStart = spoiler_ranges[i][0];
                int spoilerEnd = spoiler_ranges[i][1];

                if (isOverlap(startIndex, endIndex, spoilerStart, spoilerEnd)) {

                    isSpoiler = true;
                    spoilerWords.get(i).add(word);
                }

            }

            if (!isSpoiler) {
                normalWords.add(word);
            }

            index++;
        }

        // 중복 단어 검사
        Set<String> confirmWord = new HashSet<>();

        for (List<String> words : spoilerWords) {

            for (String word : words) {

                boolean isImportantWord = !normalWords.contains(word) && !confirmWord.contains(word);

                if (isImportantWord) {
                    answer++;
                }

                confirmWord.add(word);
                

            }
        }



        return answer;
    }

    private boolean isOverlap(int startIndex, int endIndex, int spoilerStart, int spoilerEnd) {
        return Math.max(startIndex, spoilerStart) <= Math.min(endIndex, spoilerEnd);
    }


}