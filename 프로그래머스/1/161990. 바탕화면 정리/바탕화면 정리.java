class Solution {
    public int[] solution(String[] wallpaper) {
        
        
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;

        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;


        for (int i = 0; i < wallpaper.length; i++) {
            
            String str = wallpaper[i];

            for (int j = 0; j < str.length(); j++) {
                
                char c = str.charAt(j);
                
                if (c == '#') {

                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    
                    maxRow = Math.max(maxRow, i + 1);
                    maxCol = Math.max(maxCol, j + 1);
                    
                }
                
            }
            
        }
        

        return new int[] {minRow, minCol, maxRow, maxCol};
    }
}