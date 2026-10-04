class Solution {
    public String solution(int[] numbers, String hand) {

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * * 0 #
         *
         * 1 4 7 은 row = (number - 1) / 3 col = 0
         * 3 6 9 은 row = (number - 1) / 3 col = 2
         *
         * 2 5 8 0 일 경우 거리 비교
         * Math.abs(leftRow - tagetRow) + Math.abs(leftCol - targetCol) -> 맨헤튼 거리
         * Math.abs(rightRow - tagetRow) + Math.abs(rightCol - targetCol) -> 맨헤튼 거리
         * targetCol = 1
         * targetRow = (number - 1) / 3 / 0일경우 targetRow = 3
         * 
         * 거리가 같을 경우 주어진 hand에 따라 결정
         */
        
        StringBuilder sb = new StringBuilder();

        int leftRow = 3;
        int leftCol = 0;
        
        int rightRow = 3;
        int rightCol = 2;
        
        for (int number : numbers) {
            
            if (number == 1 || number == 4 || number == 7) {
                
                sb.append("L");
                
                leftRow = (number - 1) / 3;
                leftCol = 0;
                
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                
                rightRow = (number - 1) / 3;
                rightCol = 2;
                
            } else {
                
                int targetRow;
                int targetCol = 1;
                
                if (number == 0) {
                    targetRow = 3;
                } else {
                    targetRow = (number - 1) / 3;
                }

                int leftDis = Math.abs(leftRow - targetRow) + Math.abs(leftCol - targetCol);
                int rightDis = Math.abs(rightRow - targetRow) + Math.abs(rightCol - targetCol);
                
                
                if (leftDis < rightDis) {
                    sb.append("L");
                    leftRow = targetRow;
                    leftCol = targetCol;
                } else if (leftDis > rightDis) {
                    sb.append("R");
                    rightRow = targetRow;
                    rightCol = targetCol;
                    
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftRow = targetRow;
                        leftCol = targetCol;
                    } else {
                        sb.append("R");
                        rightRow = targetRow;
                        rightCol = targetCol;
                    }
                }


            }

        }
        
        
        return sb.toString();
    }
}