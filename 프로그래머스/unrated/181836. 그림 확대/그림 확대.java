class Solution {
    public String[] solution(String[] picture, int k) {

        int row = picture.length;
        int col = picture[0].length();

        int newRow = row * k;
        int newCol = col * k;
        String[] answer = new String[newRow];

        for (int i = 0; i < newRow; i++) {
            StringBuilder sb = new StringBuilder();
            int rows = i /k;
            for (int j = 0; j < newCol; j++) {
                int cols = j / k;
                char c = picture[rows].charAt(cols);
                sb.append(c);
            }
            
            answer[i] = sb.toString();
        }
        return answer;
    }
}