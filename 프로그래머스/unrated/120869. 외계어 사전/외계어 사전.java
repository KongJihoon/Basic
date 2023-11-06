class Solution {
    public int solution(String[] spell, String[] dic) {

        for (String item : dic){
            int cnt = 0;

            for (String itemA : spell){
                if(item.contains(itemA)){
                    cnt++;
                }
            }
            if (cnt == spell.length){
                return 1;
            }
            

        }
        return 2;
    }
}