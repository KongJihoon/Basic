class Solution {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (char c : new_id.toCharArray()) {

            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-'
            || c == '_' || c == '.') {
                sb.append(c);
            }


        }

        new_id = sb.toString();

        sb = new StringBuilder();

        for (char c : new_id.toCharArray()) {

            if (c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                continue;
            }

            sb.append(c);

        }

        new_id = sb.toString();

        if (!new_id.isBlank() && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }

        if (!new_id.isBlank() && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if (new_id.isBlank()) {
            new_id = "a";
        }

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        while (new_id.length() < 3) {
            
            char c = new_id.charAt(new_id.length() - 1);
            
            new_id += c;
        }

        return new_id;
    }
}