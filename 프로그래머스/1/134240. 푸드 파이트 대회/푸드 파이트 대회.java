class Solution {
    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();


        for (int i = 1; i < food.length; i++) {

            int cnt = food[i] / 2;

            for (int j = 0; j < cnt; j++) {

                sb.append(i);

            }

        }

        StringBuilder second = new StringBuilder(sb).reverse();

        sb.append(0).append(second);



        return sb.toString();
    }
}