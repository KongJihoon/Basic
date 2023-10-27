class Solution {
    public int solution(int[] box, int n) {
        
        int cntA = box[0] / n;
        int cntB = box[1] / n;
        int cntC = box[2] / n;
        return cntA * cntB * cntC;
    }
}