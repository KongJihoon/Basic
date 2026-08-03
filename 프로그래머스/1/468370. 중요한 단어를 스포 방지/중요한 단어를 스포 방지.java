import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {


        int answer = 0;

        int messageLen = message.length();

        int rangeLen = spoiler_ranges.length;

        int[] spoilerIndex = new int[messageLen];

        Arrays.fill(spoilerIndex, -1);

        for (int i = 0; i < rangeLen; i++) {

            int start = spoiler_ranges[i][0];
            int end = spoiler_ranges[i][1];

            for (int j = start; j <= end; j++) {
                spoilerIndex[j] = i;
            }

        }

        List<List<String>> wordByRevealOrder = new ArrayList<>();

        for (int i = 0; i < rangeLen; i++) {
            
            wordByRevealOrder.add(new ArrayList<>());
        }

        Set<String> normalWords = new HashSet<>();
        
        int index = 0;
        
        while (index < messageLen) {
            
            int wordStart = index;
            
            while (index < messageLen && message.charAt(index) != ' ') {
                index++;
            }
            
            int wordEnd = index - 1;
            
            String word = message.substring(wordStart, index);
            
            
            int revealOrder = -1;

            for (int i = wordStart; i <= wordEnd; i++) {
                
                revealOrder = Math.max(revealOrder, spoilerIndex[i]);
                
            }
            
            if (revealOrder == -1) {
                normalWords.add(word);
            } else {
                wordByRevealOrder.get(revealOrder).add(word);
            }
            
            index++;
            
        }
        
        Set<String> revealWords = new HashSet<>();
        
        for (List<String> words : wordByRevealOrder) {
            
            
            for (String word : words) {
                boolean isImportant = !normalWords.contains(word) && !revealWords.contains(word);
                
                if (isImportant) {
                    answer++;
                }
                
                revealWords.add(word);
            }
            
        }


        return answer;
    }
}