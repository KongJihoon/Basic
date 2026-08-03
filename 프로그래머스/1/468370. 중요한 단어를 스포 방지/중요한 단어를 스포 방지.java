import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;

        int messageLen = message.length();

        List<List<String>> spoilerWords = new ArrayList<>();

        for (int i = 0; i < spoiler_ranges.length; i++) {
            spoilerWords.add(new ArrayList<>());
        }

        int index = 0;

        Set<String> normalWords = new HashSet<>();

        while (index < messageLen) {

            int startIndex = index;

            while (index < messageLen && message.charAt(index) != ' ') {
                index++;
            }

            int endIndex = index - 1;

            boolean isSpoiler = false;

            String word = message.substring(startIndex, index);

            for (int i = 0; i < spoiler_ranges.length; i++) {

                int rangeStart = spoiler_ranges[i][0];
                int rangeEnd = spoiler_ranges[i][1];

                if (isOverlap(startIndex, endIndex, rangeStart, rangeEnd)) {
                    isSpoiler = true;

                    spoilerWords.get(i).add(word);
                }
            }
            
            if (!isSpoiler) {
                normalWords.add(word);
            }
            
            index++;

        }
        
        Set<String> confirmWords = new HashSet<>();
        
        for (List<String> words : spoilerWords) {
            
            for (String word : words) {
                
                boolean isImportant = !normalWords.contains(word) && !confirmWords.contains(word);
                
                if (isImportant) {
                    answer++;
                }
                
                confirmWords.add(word);
                
            }
            
        }


        return answer;
    }

    private boolean isOverlap(int wordStart, int wordEnd, int rangeStart, int rangeEnd) {

        return Math.max(wordStart, rangeStart) <= Math.min(wordEnd, rangeEnd);
    }
}