package Day_76_Sorting_the_Sentence;
import java.util.Arrays;
class Solution {
    public String sortSentence(String s) {
        String arr[] = s.trim().split(" ");
        String newarr[] = new String[arr.length];
        for(String x : arr)
        {
            int index = x.charAt(x.length()-1)-'0';
            newarr[index-1]=x.substring(0,x.length()-1);
        }
        String ans="";
        for(int i=0;i<newarr.length;i++)
        {
            ans=ans+newarr[i];
            if(i!=newarr.length-1)
            {
                ans=ans+" ";
            }
        }
        return ans;


        
    }
}

public class Day_76_Sorting_the_Sentence {
    
}
