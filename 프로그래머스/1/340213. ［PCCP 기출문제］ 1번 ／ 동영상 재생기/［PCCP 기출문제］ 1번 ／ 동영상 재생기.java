class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        

        int videoSec = toSec(video_len);

        int posSec = toSec(pos);

        int opStartSec = toSec(op_start);

        int opEndSec = toSec(op_end);

        for (String command : commands) {
            
            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }

            if (command.equals("next")) {
                posSec += 10;

                if (posSec >= videoSec) {
                    posSec = videoSec;
                }
            } else {
                posSec -= 10;

                if (posSec <= 0) {
                    posSec = 0;
                }
            }

            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }

        }



        return toTime(posSec);
    }


    public static int toSec(String time) {

        String[] times = time.split(":");


        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);

    }

    public static String toTime(int sec) {

        if (sec == 0) {
            return "00:00";
        }

        int m = sec / 60;
        int s = sec % 60;

        return String.format("%02d:%02d", m,s);
    }


    public static void main(String[] args) {
        String video_len = "10:55";

        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";

        String[] commands = {"prev", "next", "next"};

        System.out.println(solution(video_len, pos, op_start, op_end,commands));
    }


}