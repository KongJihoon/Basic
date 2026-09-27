import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {

        ArrayList<Long> list = new ArrayList<>();

        long value = x;

        list.add(value);

        for (int i = 1; i < n; i++) {

            value += x;

            list.add(value);

        }

        return list.stream()
                .mapToLong(Long::longValue)
                .toArray();
    }
}