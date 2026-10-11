import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> list = new ArrayList<>();

        int curr = covertDay(today);

        Map<String, Integer> map = new HashMap<>();

        for (String term : terms) {

            String[] parts = term.split(" ");

            map.put(parts[0], Integer.parseInt(parts[1]));

        }

        for (int i = 0; i < privacies.length; i++) {

            String[] parts = privacies[i].split(" ");

            String selectedDate = parts[0];

            int selectedDay = covertDay(selectedDate);

            int month = map.get(parts[1]);

            int expireDay = selectedDay + (month * 28);

            if (curr >= expireDay) {
                list.add(i + 1);
            }

        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


    private int covertDay(String date) {

        String[] parts = date.split("\\.");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);


        return (year * 12 * 28) + (month * 28) + day;
    }
}