import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        int[] minCount = new int[26];

        Arrays.fill(minCount, Integer.MAX_VALUE);

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {

                char c = key.charAt(i);


                minCount[c - 'A'] = Math.min(minCount[c - 'A'], i + 1);

            }

        }

        ArrayList<Integer> list = new ArrayList<>();


        for (String target : targets) {

            int sum = 0;

            for (int i = 0; i < target.length(); i++) {

                char c = target.charAt(i);

                if (minCount[c - 'A'] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                } else {
                    
                    sum += minCount[c - 'A'];
                }

            }
            
            list.add(sum);

        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}