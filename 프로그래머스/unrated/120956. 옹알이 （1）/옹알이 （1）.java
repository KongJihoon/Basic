class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (String s : babbling){
            for (String n : str){
                s = s.replace(n, " ");
            }
            if(s.replaceAll(" ","").equals("")){
                answer++;
            }
        }

        return answer;
    }
}