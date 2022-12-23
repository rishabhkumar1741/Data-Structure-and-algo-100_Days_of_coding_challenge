package Day_40_Two_Sum_with_O_n_Time;
import java.util.*;
class Solution 
{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            if(maps.containsKey(diff))
            {
                return new int[]{maps.get(diff),i};
            }
            else{
                maps.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }
}

public class Day_40_Two_Sum_with_O_n_Time{
    
}
