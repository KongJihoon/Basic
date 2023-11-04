import java.util.ArrayList;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        ArrayList<String> list = new ArrayList<>();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("A")){
                arr[i] = "B";
                list.add(arr[i]);
            }else if(arr[i].equals("B")){
                arr[i] = "A";
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        if(result.contains(pat)){
            answer = 1;
        }
        
        
        
        return answer;
    }
}