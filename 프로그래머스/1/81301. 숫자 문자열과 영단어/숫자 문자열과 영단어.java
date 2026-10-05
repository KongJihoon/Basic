import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {


        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            map.put(numbers[i], i);

        }

        StringBuilder answer = new StringBuilder();
        
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
               answer.append(c);
                continue;
            }

            word.append(c);
            
            
            if (map.containsKey(word.toString())) {
                answer.append(map.get(word.toString()));
                word.setLength(0);
            }

        }

        return Integer.parseInt(answer.toString());
    }
}