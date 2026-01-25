
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new LinkedList<>(List.of(cards1));

        Queue<String> q2 = new LinkedList<>(List.of(cards2));

        for (String s : goal) {

            if (!q1.isEmpty() && q1.peek().equals(s)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(s)) {
                q2.poll();
            } else {
                return "No";
            }


        }

        return "Yes";

    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};

        String[] goals = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goals));
    }

}


