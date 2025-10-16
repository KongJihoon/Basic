class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowerCase = s.toLowerCase();

        int pCnt = 0;

        int yCnt = 0;

        for (char c : lowerCase.toCharArray()) {

            if (c == 'p') {
                pCnt++;
            } else if (c == 'y') {
                yCnt++;
            }

        }

        if (pCnt == yCnt) {
            return true;
        } else if (pCnt == 0 && yCnt == 0) {
            return true;
        } else {
            return false;
        }


    }
}
