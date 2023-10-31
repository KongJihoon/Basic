import java.util.Arrays;
import java.util.Hashtable;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for(char item : c){
            ht.put(item,ht.getOrDefault(item,0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char item : ht.keySet()){
            if(ht.get(item) == 1){
                sb.append(item);
            }

        }
        char[] arr= sb.toString().toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}
