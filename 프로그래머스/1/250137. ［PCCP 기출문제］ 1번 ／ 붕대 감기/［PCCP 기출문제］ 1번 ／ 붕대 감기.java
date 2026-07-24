class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currHealth = health;
        int count = 0;

        int time = attacks[attacks.length - 1][0];
        int idx = 0;

        for (int i = 0; i <= time; i++) {

            if (count == bandage[0]) {
                currHealth = Math.min(currHealth + bandage[2], health);
                count = 0;
            }

            if (attacks[idx][0] == i) {
                currHealth -= attacks[idx][1];
                count = 0;

                if (currHealth <= 0) return -1;

                idx++;
            } else {
                currHealth = Math.min(currHealth + bandage[1], health);
                count++;
            }

        }


        return currHealth;
    }
}