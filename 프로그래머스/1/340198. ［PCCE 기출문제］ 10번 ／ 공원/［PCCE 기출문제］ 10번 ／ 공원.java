import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;

        int row = park.length;

        int col = park[0].length;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {

            int size = mats[i];

            for (int startRow = 0; startRow <= row - size; startRow++) {
                for (int startCol = 0; startCol <= col - size; startCol++) {
                    
                    boolean possible = true;

                    for (int j = startRow; j < startRow + size; j++) {
                        
                        if (!possible) {
                            break;
                        }

                        for (int k = startCol; k < startCol + size; k++) {

                            if (!park[j][k].equals("-1")) {
                                possible = false;
                                break;
                            }

                        }
                        
                    }

                    if (possible) {
                        return size;
                    }
                    
                }


            }

        }

        return -1;
    }
}