class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] xCnt = new int[10];
        int[] yCnt = new int[10];


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {

            xCnt[X.charAt(i) - '0']++;

        }

        for (int i = 0; i < Y.length(); i++) {

            yCnt[Y.charAt(i) - '0']++;

        }

        for (int i = 9; i >= 0; i--) {

            int count = Math.min(xCnt[i], yCnt[i]);

            for (int j = 0; j < count; j++) {

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