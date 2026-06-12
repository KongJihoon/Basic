import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {


        // map.getOrDefault로 각 키 인덱스의 최솟값 저장
        // 저장 후 target 배열을 순회 하면서 문자열을 완성할 수 있는지 판별
        // 판별 후 완성할 수 있다면 sum값을 answer 배열에 저장 후 리턴
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                int push = i + 1;

                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), push));
            }

        }

        int index = 0;
        for (String target : targets) {

            int sum = 0;
            boolean isPossible = true;


            for (int i = 0; i < target.length(); i++) {

                char targetCh = target.charAt(i);


                if (!map.containsKey(targetCh)) {
                    isPossible = false;
                    break;
                }

                sum += map.get(targetCh);
            }

            if (isPossible) {
                answer[index++] = sum;
            } else {
                answer[index++] = -1;
            }

        }



        return answer;
    }
}