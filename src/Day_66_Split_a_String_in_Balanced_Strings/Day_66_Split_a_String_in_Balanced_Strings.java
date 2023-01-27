package Day_66_Split_a_String_in_Balanced_Strings;
class Solution {
    
    public int balancedStringSplit(String s) 
    {
        int sum =0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                sum++;
            }
            else{
                sum--;
            }
            if(sum==0)
            {
                count++;
            }
        }
        return count;
    }
}

public class Day_66_Split_a_String_in_Balanced_Strings {
    
}
