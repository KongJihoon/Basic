class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};


        int height = park.length;
        int width = park[0].length();

        boolean isFound = false;

        int x = 0;
        int y = 0;

        // 시작지점
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {

                if (park[i].charAt(j) == 'S') {

                    x = i;
                    y = j;

                    isFound = true;
                }

            }

            if (isFound) {
                break;
            }
        }

        for (String route : routes) {

            String[] parts = route.split(" ");

            String direction = parts[0];

            int distance = Integer.parseInt(parts[1]);

            int dx = 0;
            int dy = 0;

            if (direction.equals("N")) {
                dx = -1;
            } else if (direction.equals("S")) {
                dx = 1;
            } else if (direction.equals("E")) {
                dy = 1;
            } else if (direction.equals("W")) {
                dy = -1;
            }

            // 실제 이동 전에 가능한지 검사
            int nx = x;
            int ny = y;

            boolean canMove = true;
            for (int i = 0; i < distance; i++) {

                nx += dx;
                ny += dy;

                if (nx < 0 || nx >= height || ny < 0 || ny >= width) {
                    canMove = false;
                    break;
                }
                
                if (park[nx].charAt(ny) == 'X') {
                    canMove = false;
                    break;
                }
                
            }
            if (canMove) {
                x = nx;
                y = ny;
            }


        }



        return new int[] {x, y};
    }
}