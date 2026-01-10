
class Solution {

  


    public static int solution(int number, int limit, int power) {


        int weight = 1;

        for (int i = 2; i <= number; i++) {

            int newPower = getPower(i);


            if (newPower > limit) {
                weight += power;
                continue;
            }

            weight += newPower;

        }

        return weight;
    }


    public static int getPower(int number) {
        int cnt = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                cnt++;               
                if (i != number / i) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number, limit, power));

    }

}