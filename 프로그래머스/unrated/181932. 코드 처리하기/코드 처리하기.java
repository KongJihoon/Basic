class Solution {
    public String solution(String code) {
        String answer = "";
        

        int mode = 0;
        char[] c = new char[code.length()];

        for (int i = 0; i < code.length(); i++) {
            c[i] = code.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {

                if (mode == 0) {
                    if (c[i] == '1') {
                        mode = 1;
                        continue;
                    }
                    if(i % 2 == 0){
                        answer += c[i];
                    }

                } else if (mode == 1) {
                    if (c[i] == '1') {
                        mode = 0;
                        continue;
                    }
                    if(i % 2 != 0) {
                        answer += c[i];

                    }
                }

        }
        if(answer.length() == 0){
            answer = "EMPTY";
        }
        
        return answer;
    }
}