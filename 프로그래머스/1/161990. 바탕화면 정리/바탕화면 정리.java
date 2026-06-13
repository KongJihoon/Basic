import java.util.Arrays;

class Solution {
    public static int[] solution(String[] wallpaper) {

        // 바탕화면 상태를 나타내는 문자열 배열 wallpaper 가장 왼쪽 위를 0,0
        // 빈칸은 . / 파일이 있는 칸은 #의 값을 가짐
        // 드래그 해서 모든 파일 삭제 최소 값 리턴

        int[] answer;

        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;

        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {

            if (wallpaper[i].contains("#")) {
                if (lux > i) {
                    lux = i;
                }

                if (rdx < i) {
                    rdx = i;
                }
            }

            for (int j = 0; j < wallpaper[i].length(); j++) {

                char ch = wallpaper[i].charAt(j);

                if (ch == '#') {
                    if (luy > j) {
                        luy = j;
                    }

                    if (rdy < j) {
                        rdy = j;
                    }
                }


            }

        }

        answer = new int[]{lux, luy, rdx + 1, rdy + 1};



        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

        System.out.println(Arrays.toString(solution(wallpaper)));
    }
}