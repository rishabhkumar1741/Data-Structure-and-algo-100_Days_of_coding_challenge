package Day_47_Maximum_Number_of_Words_Found_in_Sentences;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord=0;
        for(int i=0;i<sentences.length;i++)
        {
            String sen = sentences[i];
            int len = sen.split("\\s+").length;
            if(maxWord<len)
            {
                maxWord=len;
            }
        }
        return maxWord;
        
    }
}

public class Day_47_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        String str = "Hello I'm your String";
        
        System.out.println(str.split("\\s+").length);

    }
    
}
