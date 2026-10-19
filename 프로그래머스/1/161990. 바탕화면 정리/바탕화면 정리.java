class Solution {
    public int[] solution(String[] wallpaper) {
        

        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;

        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {


                if (wallpaper[i].charAt(j) == '#') {

                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    
                    maxRow = Math.max(maxRow, i + 1);
                    maxCol = Math.max(maxCol, j + 1);

                }

            }

        }

        return new int[]{minRow, minCol, maxRow, maxCol};
    }
}