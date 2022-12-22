package Day_38_Two_Sum;
class Solution 
{
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {

            for(int j=i+1;j<nums.length;j++)
            {
                
                if(nums[i]+nums[j]==target)
                {
                    int arr[] = new int[]{i,j};
                    return arr;
                }

            }
        }
        return new int[]{1,2};
    }
}

public class Day_38_Two_Sum {
    
}
