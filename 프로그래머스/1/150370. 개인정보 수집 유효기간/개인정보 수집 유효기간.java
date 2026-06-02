import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> result = new ArrayList<>();

        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {

            String[] split = term.split(" ");

            termMap.put(split[0], Integer.parseInt(split[1]) * 28);

        }

        int todayDays = toDays(today);

        for (int i = 0; i < privacies.length; i++) {

            String[] split = privacies[i].split(" ");

            int collectDays = toDays(split[0]);

            String type = split[1];

            int expireDays = collectDays + termMap.get(type);

            if (todayDays >= expireDays) {
                result.add(i + 1);
            }

        }


        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


    public int toDays(String date) {

        String[] split = date.split("\\.");

        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);


        return year * 12 * 28 + month * 28 + 28 + day;
    }
}