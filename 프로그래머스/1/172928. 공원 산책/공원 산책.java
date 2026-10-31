class Solution {
    public int[] solution(String[] park, String[] routes) {

        int width = park[0].length() - 1;
        int height = park.length - 1;

        int row = 0;
        int col = 0;

        for (int i = 0; i < park.length; i++) {

            String str = park[i];
            boolean find = false;

            for (int j = 0; j < str.length(); j++) {

                char c = str.charAt(j);

                if (c == 'S') {
                    row = i;
                    col = j;
                    find = true;
                    break;
                }
            }

            if (find) {
                break;
            }
        }

        for (String route : routes) {

            String[] part = route.split(" ");
            String direction = part[0];
            int distance = Integer.parseInt(part[1]);

            int dx = row;
            int dy = col;
            
            boolean canMove = true;

            for (int i = 0; i < distance; i++) {

                if (direction.equals("N")) {
                    dx--;
                } else if (direction.equals("S")) {
                    dx++;
                } else if (direction.equals("W")) {
                    dy--;
                } else {
                    dy++;
                }
                
                if (dx < 0 || dx > height || dy < 0 || dy > width) {
                    canMove = false;
                    break;
                }
                
                if (park[dx].charAt(dy) == 'X') {
                    canMove = false;
                    break;
                }
                
            }
            
            if (canMove) {
                row = dx;
                col = dy;
            }


        }


        return new int[] {row, col};
    }
}