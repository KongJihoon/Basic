class Solution {
    public StringBuffer solution(String my_string, int m, int c) {
        StringBuffer br = new StringBuffer();

        for (int i = c - 1; i < my_string.length(); i += m) {
            br.append(my_string.charAt(i));
        }
        return br;
    }
}