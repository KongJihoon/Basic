import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public Integer[] solution(int[] numlist, int n) {
        Integer[] integerArray = Arrays.stream(numlist)
                                       .boxed()
                                       .toArray(Integer[]::new);
        
        Arrays.sort(integerArray, new Distance(n));
        
        return integerArray;
    }

    public static class Distance implements Comparator<Integer>{
        public int n;

        public Distance(int n) {
            this.n = n;
        }

        @Override
        public int compare(Integer a, Integer b) {
            int distanceA = Math.abs(a - n);
            int distanceB = Math.abs(b - n);
            if(distanceA == distanceB){
                return b - a;
            }else {
                return distanceA - distanceB;
            }

        }
    }
}