package Day_77_Check_if_the_Sentence_Is_Pangram;
import java.util.Arrays;
class Solution {
    public boolean checkIfPangram(String sentence) {
        char start= 'a';
        int count=0;
        char chararr[] = sentence.toCharArray();
        Arrays.sort(chararr);
        String newdata = new String(chararr);
        for(int i=0;i<newdata.length();i++)
        {
            if(start==newdata.charAt(i) && start<123)
            {
                start++;
                count++;
            }
        }
        if(count==26)
        {
            return true;
        }
        else{
            return false;
        }


        
    }
}

public class Day_77_Check_if_the_Sentence_Is_Pangram {
    
}
