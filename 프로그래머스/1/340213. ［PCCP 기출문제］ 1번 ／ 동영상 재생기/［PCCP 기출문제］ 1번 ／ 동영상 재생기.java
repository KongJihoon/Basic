class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int videoSec = toSec(video_len);

        int currSec = toSec(pos);

        int opStartSec = toSec(op_start);

        int opEndSec = toSec(op_end);

        if (currSec >= opStartSec && currSec <= opEndSec) {
            currSec = opEndSec;
        }

        for (String command : commands) {

            if (command.equals("next")) {
                currSec = Math.min(currSec + 10, videoSec);
            } else if (command.equals("prev")) {

                currSec = Math.max(0, currSec - 10);
            }


            if (currSec >= opStartSec && currSec <= opEndSec) {
                currSec = opEndSec;
            }

        }

        answer = toTime(currSec);

        return answer;
    }

    private String toTime(int currSec) {

        int m = currSec / 60;
        int s = currSec % 60;


        return String.format("%02d:%02d", m, s);
    }


    public int toSec(String time) {

        String[] times = time.split(":");

        int m = Integer.parseInt(times[0]);
        int s = Integer.parseInt(times[1]);

        return m * 60 + s;

    }
}