class Solution {
    public String solution(String s) {
        String answer = "";

        char[] chaArr = s.toCharArray();

        for (int i = 0; i < chaArr.length - 1; i++) {

            for (int j = i + 1; j < chaArr.length; j++) {

                int a = chaArr[i] - '0';
                int b = chaArr[j] - '0';


                if (a < b) {
                    swap(chaArr, i, j);
                }
            }

        }

        for (int i = 0; i < chaArr.length; i++) {
            answer += chaArr[i];
        }


        return answer;
    }

    public void swap(char[] chaArr, int i, int j) {

        char tmp = chaArr[i];
        chaArr[i] = chaArr[j];
        chaArr[j] = tmp;
    }
}