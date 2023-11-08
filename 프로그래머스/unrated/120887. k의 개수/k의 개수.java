class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = String.valueOf(k);
        for (int l = i; l <= j ; l++) {
            String value = String.valueOf(l);
            if(value.contains(s)){
                String[] arr = value.split("");
                
                for (String item : arr){
                    if (item.contains(s)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}