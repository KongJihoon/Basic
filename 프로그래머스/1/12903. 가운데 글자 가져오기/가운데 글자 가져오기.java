class Solution {
    public String solution(String s) {


        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        if (s.length() % 2 == 0) {

            sb.append(arr[(s.length() / 2) - 1]).append((arr[(s.length() / 2)]));

        } else {
            sb.append(arr[(s.length() / 2)]);
        }

        return sb.toString();
    }
}