
import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(int x, int n) {


        ArrayList<Long> list = new ArrayList<>();

        long num = 0;

        if (x < 0) {

            while (n-- > 0) {

                num += x;

                list.add(num);


            }

            return list;

        } else  {


            while (n-- > 0) {

                num += x;

                list.add(num);

            }

            return list;
        }



    }
}