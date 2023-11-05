class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int n = 0;
        int r = 0;
        for (int i = 1; i < dots.length; i++) {
            if(x != dots[i][0]){
                n = Math.abs(x - dots[i][0]);
            }
            if(y != dots[i][1]){
                r = Math.abs(y - dots[i][1]);
            }
        }
        return n * r;
    }
}