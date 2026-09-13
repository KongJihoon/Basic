class Solution {

    int[] tiles;

    private static final int MAX_VALUE = 1_000_000_007;

    public int solution(int n) {
        int answer = 0;

        tiles = new int[n + 1];
        
        tiles[1] = 1;
        
        tiles[2] = 2;

        for (int i = 3; i <= n; i++) {
            
            tiles[i] = (tiles[i - 1] + tiles[i - 2]) % MAX_VALUE;
            
        }
        
        answer = tiles[n];

        return answer;
    }
}