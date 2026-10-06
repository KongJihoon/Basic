import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> userIndex = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            userIndex.put(id_list[i], i);
        }

        Map<String, Integer> userReported = new HashMap<>();

        Set<String> reports = new HashSet<>(Arrays.asList(report));

        for (String r : reports) {

            String[] users = r.split(" ");
            String reported = users[1];

            userReported.put(reported, userReported.getOrDefault(reported, 0) + 1);

        }

        Set<String> banned = new HashSet<>();

        for (String reported : userReported.keySet()) {

            if (userReported.get(reported) >= k) {
                banned.add(reported);
            }

        }

        for (String r : reports) {

            String[] users = r.split(" ");
            String reporter = users[0];
            String reported = users[1];

            if (banned.contains(reported)) {
                int index = userIndex.get(reporter);
                answer[index]++;

            }

        }


        return answer;
    }
}