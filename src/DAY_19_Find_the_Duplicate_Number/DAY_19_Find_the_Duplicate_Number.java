package DAY_19_Find_the_Duplicate_Number;
import java.util.*;

public class DAY_19_Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                return nums[i];
                
            }
        }
        return -1;        
        
    }
}
