class Solution {
    public int[] solution(String[] park, String[] routes) {

        int width = park[0].length() - 1;
        int height = park.length - 1;

        int row = 0;
        int col = 0;

        for (int i = 0; i < park.length; i++) {

            boolean isStart = false;
            String str = park[i];

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == 'S') {
                    row = i;
                    col = j;
                    isStart = true;
                    break;
                }

            }

            if (isStart) {
                break;
            }

        }

        for(String str : routes) {
            String[] part = str.split(" ");
            String direction = part[0];
            int distance = Integer.parseInt(part[1]);

            int dx = row;
            int dy = col;
            boolean isMove = true;

            for (int i = 0; i < distance; i++) {

                if (direction.equals("N")) {
                    dx--;
                } else if (direction.equals("S")) {
                    dx++;
                } else if (direction.equals("W")) {
                    dy--;
                } else if (direction.equals("E")) {
                    dy++;
                }

                if (dx < 0 || dx > height || dy < 0 || dy > width) {
                    isMove = false;
                    break;
                }

                if (park[dx].charAt(dy) == 'X') {
                    isMove = false;
                    break;
                }

            }

            if (isMove) {
                row = dx;
                col = dy;
            }

        }




        return new int[]{row, col};
    }
}