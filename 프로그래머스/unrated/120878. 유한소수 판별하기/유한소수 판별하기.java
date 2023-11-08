import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a,b);
        a = a / gcd;
        b = b / gcd;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                list.add(i);
                b = b/i;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 3 || list.get(i) == 4 || list.get(i) > 5){
                return 2;
            }
        }


        return 1;
    }


    public static int gcd(int a, int b) {
        if(a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
}