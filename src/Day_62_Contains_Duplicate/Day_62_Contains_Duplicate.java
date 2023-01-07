package Day_62_Contains_Duplicate;
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean x = false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                x =true;
                break;
            }
        }
        return x;
        
    }
}
public class Day_62_Contains_Duplicate{

}