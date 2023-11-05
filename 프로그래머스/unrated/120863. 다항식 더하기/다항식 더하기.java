class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int n = 0;
        for (String item : polynomial.split(" ")){
            if(item.contains("x")){
                x += item.equals("x") ? 1 : Integer.parseInt(item.replaceAll("x",""));
            } else if (!item.equals("+")) {
                n += Integer.parseInt(item);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(x != 0){
            sb.append(x > 1 ? x + "x" : "x");
        }else{
            sb.append("");
        }
        if(n != 0){
            sb.append(x != 0 ? " + " + n : n);
        }
        return sb.toString();
    }
}