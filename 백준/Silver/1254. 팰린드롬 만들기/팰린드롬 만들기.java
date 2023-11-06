import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(isPalendrome(s.substring(i))){
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }

    public static boolean isPalendrome(String s){
        if(s == null){
            return false;
        }
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}