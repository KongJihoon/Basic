
class Solution {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();


        int idx = 0;

        for (char c : s.toCharArray()) {


            if (c == ' ') {
                sb.append(' ');
                idx = 0;
            } else {

                sb.append((idx++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }


        }




        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s));
    }
}