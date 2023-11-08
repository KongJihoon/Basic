class Solution {
    final int Bonus = 10;
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= Bonus){
            int newChicken = chicken / Bonus;
            int res = chicken % Bonus;
            chicken = newChicken + res;
            
            answer += newChicken;
        }
        
        return answer;
    }
}