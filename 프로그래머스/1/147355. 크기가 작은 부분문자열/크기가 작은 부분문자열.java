class Solution {
    public static int solution(String t, String p) {
        int answer = 0;


        for (int i = 0; i <= t.length() - p.length(); i++) {

            String s = t.substring(i, i + p.length());

            if (s.compareTo(p) <= 0) {
                answer++;
            }

        }

        return answer;
    }



    public static void main(String[] args) {

        String t = "10203";
        String p = "15";

        int solution = solution(t, p);

        System.out.println(solution);

    }
}