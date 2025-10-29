

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static int solution(String dartResult) {
        int answer = 0;


        HashMap<Character, Integer> map = new HashMap<>();

        map.put('S', 1);
        map.put('D', 2);
        map.put('T', 3);

        ArrayList<Integer> list = new ArrayList<>();

        String score = "";

        for (int i = 0; i < dartResult.length(); i++) {


            char ch = dartResult.charAt(i);

            if (Character.isDigit(ch)) {
                
                if (score.equals("1")) {
                    score = "10";
                    continue;
                }
                
                score = String.valueOf(dartResult.charAt(i));
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {

                int scores = Integer.parseInt(score);

                list.add((int) Math.pow(scores, map.get(ch)));

                score = "";

            } else if (ch == '*') {

                if (list.size() == 1) {
                    list.set(0, list.get(0) * 2);
                } else {
                    list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                    list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                }

            } else if (ch == '#') {

                list.set(list.size() - 1, list.get(list.size() - 1) * -1);
            }


        }


        for (int i = 0; i < list.size(); i++) {

            answer += list.get(i);

        }


        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution("1D#2S*3S"));


    }
}