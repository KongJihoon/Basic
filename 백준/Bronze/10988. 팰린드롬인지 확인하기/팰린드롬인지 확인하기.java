
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();
        
        
        if (isPalindrome(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        






    }
    
    public static boolean isPalindrome(String str) {
        
        
        int left = 0;
        
        int right = str.length() - 1;
        
        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
            
            
            
        }
        
        return true;
        
        
    }







}