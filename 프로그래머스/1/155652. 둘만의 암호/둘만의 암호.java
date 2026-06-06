import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static String solution(String s, String skip, int index) {

        Set<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (char c : skip.toCharArray()) {

            set.add(c);
        }

        for (char ch : s.toCharArray()) {

            int count = 0;

            char current = ch;

            while (count < index) {

                current++;

                if (current > 'z') {
                    current = 'a';
                }


                if (!set.contains(current)) {
                    count++;
                }

            }

            sb.append(current);




        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "aukks";
        String skip = "wbqd";

        int index = 5;

        System.out.println(solution(s, skip, index));

    }

}