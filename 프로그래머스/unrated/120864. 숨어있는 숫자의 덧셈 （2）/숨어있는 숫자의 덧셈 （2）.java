class Solution {
    public int solution(String my_string) {
        int curNum = 0;
        int sum = 0;
        boolean isNum = false;

        for (char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                curNum = 10 * curNum + (c - '0');
                isNum = true;
            } else if (isNum) {
                sum += curNum;
                curNum = 0;
                isNum =false;
            }
        }
        if(isNum){
            sum += curNum;
        }

        return sum;
    }
}