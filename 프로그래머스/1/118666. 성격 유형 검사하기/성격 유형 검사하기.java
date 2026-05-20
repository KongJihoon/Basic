class Solution {
    public String solution(String[] survey, int[] choices) {

        StringBuilder sb = new StringBuilder();

        char[][] mbtis = {{'R','T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        int[] alphabet = new int[26];


        for (int i = 0; i < choices.length; i++) {

            if (choices[i] > 4) {

                alphabet[survey[i].charAt(1) - 'A'] += choices[i] - 4;

            } else if (choices[i] < 4) {

                alphabet[survey[i].charAt(0) - 'A'] += 4 - choices[i];

            }


        }

        for (char[] items : mbtis) {

            if (alphabet[items[0] - 'A'] >= alphabet[items[1] - 'A']) {
                sb.append(items[0]);
            } else {
                sb.append(items[1]);
            }


        }



        return sb.toString();
    }
}