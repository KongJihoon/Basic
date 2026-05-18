import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];


        Set<String> reportSet = new HashSet<>(Arrays.asList(report));


        Map<String, Integer> reportMap = new HashMap<>();

        for (String s : reportSet) {

            String[] str = s.split(" ");

            String reported = str[1];

            reportMap.put(reported, reportMap.getOrDefault(reported, 0) + 1);

        }

        Set<String> banned = new HashSet<>();

        for (String s : reportMap.keySet()) {

            if (reportMap.get(s) >= k) {
                banned.add(s);
            }

        }

        for (String s : reportSet) {
            String[] str = s.split(" ");
            String reporter = str[0];
            String reported = str[1];

            if (banned.contains(reported)) {
                int index = Arrays.asList(id_list).indexOf(reporter);
                answer[index]++;

            }

        }



        return answer;
    }
}