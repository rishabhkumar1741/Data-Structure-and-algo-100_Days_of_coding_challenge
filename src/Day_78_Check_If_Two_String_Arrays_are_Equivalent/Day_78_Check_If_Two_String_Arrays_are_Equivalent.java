package Day_78_Check_If_Two_String_Arrays_are_Equivalent;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String data = "";
        String data1="";
        for(int i=0;i<word1.length;i++)
        {
            data = data + word1[i];
        }

        for(int i=0;i<word2.length;i++)
        {
            data1 = data1 + word2[i];
        }
        if(data.equals(data1))
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}

public class Day_78_Check_If_Two_String_Arrays_are_Equivalent {
    
}
