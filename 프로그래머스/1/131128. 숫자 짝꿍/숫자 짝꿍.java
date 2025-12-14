class Solution {
    public String solution(String X, String Y) {
        int[] cx = new int[10];
        int[] cy = new int[10];


        for (int i = 0; i < X.length(); i++) {

            cx[X.charAt(i) - '0']++;

        }


        for (int i = 0; i < Y.length(); i++) {

            cy[Y.charAt(i) - '0']++;

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {

            int k = Math.min(cx[i], cy[i]);

            for (int j = 0; j < k; j++) {

                sb.append(i);

            }


        }

        if (sb.length() == 0) {
            return "-1";
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }


        return sb.toString();
    }
}