package Day_50_Jewels_and_Stones;
import java.util.Arrays;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    count++;
                }
            }
        }
        return count;


        
    }
}
public class Day_50_Jewels_and_Stones {
    public static void main(String[] args) {
        String name = "Rishab";
        char[] namearr = name.toCharArray();
        Arrays.sort(namearr);
        String newname = new String(namearr);
        System.out.println(newname);





    }
    
}
