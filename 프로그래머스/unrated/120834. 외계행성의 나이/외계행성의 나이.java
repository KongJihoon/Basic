class Solution {
    public String solution(int age) {
        String answer = "";
        String tmp = Integer.toString(age);
        String[] tmp1 = tmp.split("");
        String[] num ={"0","1","2","3","4","5","6","7","8","9"};
        String[] eng = {"a","b","c","d","e","f","g","h","i","j"};
        for (int i = 0; i < tmp1.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(tmp1[i].equals(num[j])){
                    tmp1[i] = eng[j];
                }
            }
        }
        for (int i = 0; i < tmp1.length; i++) {
            answer += tmp1[i];
        }
        return answer;
    }
}