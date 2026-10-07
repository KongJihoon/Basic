import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        /*
         * k번 이상 신고받은 유저는 이용 정지 대상
         * id_list 유저 아이디가 주어졌을 때
         * 유저가 신고한 아이디가 주어진다. " " 기준 뒤에 있는 유저가 신고대상
         * 신고 횟수에 제한은 없지만 동일한 유저에 대한 신고 횟수는 1회
         * 각 유저가 신고했을 때 이용 정지 대상에 관련된 메일을 받은 횟수를 배열로 리턴
         */
        
        int[] answer = new int[id_list.length];

        // 각 유저의 아이디와 인덱스를 담을 Map
        Map<String, Integer> userIndex = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            
            userIndex.put(id_list[i], i);
        }
        
        // 동일한 유저에 대한 신고 중복 제거
        Set<String> reports = new HashSet<>(Arrays.asList(report));
        
        // 각 유저의 아이디와 신고 횟수를 담을 Map
        Map<String, Integer> reportedCount = new HashMap<>();
        
        for (String item : reports) {
            
            String[] users = item.split(" ");
            
            String reported = users[1];
            
            reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
            
        }
        
        // k번 이상 신고 당한 유저를 당할 Set
        Set<String> banned = new HashSet<>();

        for (String reported : reportedCount.keySet()) {
            
            if (reportedCount.get(reported) >= k) {
                banned.add(reported);
            }
        }
        
        for (String item : reports) {
            String[] users = item.split(" ");
            String reporter = users[0];
            String reported = users[1];
            
            if (banned.contains(reported)) {
                
                answer[userIndex.get(reporter)]++;
            }
            
        }


        return answer;
    }
}