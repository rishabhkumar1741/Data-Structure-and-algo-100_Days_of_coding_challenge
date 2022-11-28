package Day_35_Palindrome_String;
import java.util.*;
public class Day_35_Palindrome_String {
    int isPalindrome(String S) {
        // code here
        String r = "";
        for(int i=S.length()-1;i>=0;i--)
        {
            r=r+S.charAt(i);
        }
        if(S.equals(r))
        {
            return 1;
        }
        else{
            return 0;
        } 
    }
    public static void main(String[] args) {
        
            
    }
    
}
