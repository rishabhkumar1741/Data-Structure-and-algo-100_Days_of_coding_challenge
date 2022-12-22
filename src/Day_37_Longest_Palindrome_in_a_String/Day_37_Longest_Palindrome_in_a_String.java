package Day_37_Longest_Palindrome_in_a_String;

public class Day_37_Longest_Palindrome_in_a_String {
    public static boolean isPalindrome(String s )
    {
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static String longestPalin(String S){
        String maxString = "";
        for(int i=0;i<S.length();i++ )
        {
            // if(isPalindrome(S.substring(0,)))
        }
        return "rishabh";
        
    }
    public static void main(String[] args) {
        String str = "Rishabh";
        
        System.out.println(str.substring(0,1));
        
    }
}
