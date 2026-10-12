import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> list = new ArrayList<>();

        int currDay = convert(today);

        Map<String, Integer> map = new HashMap<>();

        for (String info : terms) {
            String[] infos = info.split(" ");

            map.put(infos[0], Integer.parseInt(infos[1]));
        }

        for (int i = 0; i < privacies.length; i++) {

            String[] privacy = privacies[i].split(" ");

            int month = map.get(privacy[1]);

            int curr = convert(privacy[0]);

            int expiredDay = curr + (month * 28);
            
            if (currDay >= expiredDay) {
                list.add(i + 1);
            }

        }

        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


    public int convert(String date) {

        String[] parts = date.split("\\.");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);


        return (year * 12 * 28) + (month * 28) + day;
    }
}