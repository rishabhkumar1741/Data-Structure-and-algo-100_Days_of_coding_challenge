package Day_9_Substring_Comparison;
import java.util.*;

public class Day_9_Substring_Comparison {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        String minString = word.substring(0,k);
        String maxString = word.substring(0,k);
        for(int i=0;i<word.length()-k+1;i++)
        {
            String substring = word.substring(i,i+k);
            if(minString.compareTo(substring)>0)
            {
                minString = substring;
            }
            if(maxString.compareTo(substring)<0)
            {
                maxString = substring;
            }
        }
        System.out.println(minString);
        System.out.println(maxString);
    }
    
}

