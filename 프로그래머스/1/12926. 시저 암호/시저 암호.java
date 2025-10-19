class Solution {
    public String solution(String s, int n) {


        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {


            if (c >= 'a' && c <= 'z') {

                char result = (char) ((c - 'a' + n) % 26 +'a');

                sb.append(result);
            } else if (c >= 'A' && c <= 'Z') {

                char result = (char) ((c - 'A' + n) % 26 +'A');

                sb.append(result);
            } else {
                sb.append(" ");
            }


        }

        return sb.toString();
    }
}