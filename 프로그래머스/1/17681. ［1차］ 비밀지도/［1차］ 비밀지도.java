class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];


        for (int i = 0; i < n; i++) {

            int orNum = arr1[i] | arr2[i];

            String binaryString = Integer.toBinaryString(orNum);

            binaryString = String.format("%" + n + "s", binaryString)
                    .replace(" ", "0");

            answer[i] = binaryString
                    .replace("1", "#")
                    .replace("0", " ");

        }



        return answer;
    }
}