package Day_10_String_palindrome;
import java.util.*;

public class Day_10_String_palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String stringdata = sc.next();
        String revercestring = "" ;
        sc.close();
        for(int i=stringdata.length()-1;i>=0;i--)
        {
            revercestring = revercestring+stringdata.charAt(i);
        }
        if(revercestring.compareTo(stringdata)==0)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
