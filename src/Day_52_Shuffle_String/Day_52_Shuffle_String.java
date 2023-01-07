package Day_52_Shuffle_String;
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] newarr = new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            newarr[indices[i]] = s.charAt(i);
        }
        return new String(newarr);
        
    }
}

public class Day_52_Shuffle_String {
    
}
