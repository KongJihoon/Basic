class Solution {
    public static int solution(int a, int b, int n) {

        int result = 0;

        if (n < a) {
            return 0;
        }


        while (true) {


            if (n < a) {
                break;
            }

            int cok = n / a;
            
            int newCola = cok * b;

            int bottle = cok * a;



            n = n - bottle + newCola;

            result += newCola;


        }


        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 1;

        int n = 20;

        System.out.println(solution(a, b, n));
    }
}