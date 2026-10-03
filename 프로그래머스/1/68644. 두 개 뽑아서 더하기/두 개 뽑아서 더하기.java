import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numbers) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                
                int number = numbers[i] + numbers[j];
                if (!list.contains(number)) {
                    list.add(number);
                }
                
            }
            
        }
        
        
        list.sort(Comparator.naturalOrder());
        
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}